import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
	public static void main(String[] args) {

		try {
			
			String urlPostgres = "jdbc:postgresql://localhost:5432/postgres";
			String urlMysql = "jdbc:mysql://localhost:3306/trainning";
			String usuario = "postgres";
			String senha = "trocar";
			
			Connection conexao = DriverManager.getConnection(urlPostgres, usuario, senha);
			
			System.out.println("Conexao com sucesso");
			
			
			Statement stm = conexao.createStatement(); //mesa de trabalho
			
			System.out.println("Fazendo a consulta na tabela...");
			ResultSet rs =  stm.executeQuery("select * from trainning.cliente");
			
			//ficara no loop enquanto existirem registros a serem lidos
			
			System.out.println("Criando uma lista para armazenar os registros do BD...");
			List<Cliente> listaCliente =  new ArrayList<Cliente>();
			
			System.out.println("Percorrendo cada registro do BD...");
			while(rs.next()) {
				
				System.out.println("Criando um objeto para armazenar o registro atual");
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEmail(rs.getString("email"));
				
				System.out.println("Incluindo o objeto na lista...");
				listaCliente.add(cliente);
			}
			
			
			System.out.println("Acabei de ler todos os registros!");
			
			System.out.println("fechando a conexao com o banco....");
			conexao.close();
			
			System.out.println("Listando os objeto, sem conexao com o banco, na tela.");
			for (Cliente cliente : listaCliente) {
				System.out.println(cliente);
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
}
