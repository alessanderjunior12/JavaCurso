import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Exemplo3 {
	public static void main(String[] args) {

		System.out.println("inserindo informacoes no BD");

		
		Cliente c = new Cliente(0, "nome1", "cpf1", "email1");
		
		
		try {
			
			String urlPostgres = "jdbc:postgresql://localhost:5432/postgres";
			String urlMysql = "jdbc:mysql://localhost:3306/trainning";
			String usuario = "postgres";
			String senha = "trocar";
			
			Connection conexao = DriverManager.getConnection(urlPostgres, usuario, senha);
			
			System.out.println("Conexao com sucesso");
			
			String sql = "insert into trainning.cliente (nome, cpf, email) values (?,?,?)";
			PreparedStatement stm = conexao.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS ); 
			
			stm.setString(1, c.getNome());
			stm.setString(2, c.getCpf());
			stm.setString(3, c.getEmail());
			
			stm.executeUpdate();
			
			System.out.println("recuperando a chave gerada pelo banco...");
			
			ResultSet rsID = stm.getGeneratedKeys();
			if(rsID.next()) {
				c.setId(rsID.getInt(1));
			}
			
			System.out.println("Fechando a conexao");
			conexao.close();
			
			System.out.println("Cliente cadatrado no banco com sucesso !");
			System.out.println(c);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
}
