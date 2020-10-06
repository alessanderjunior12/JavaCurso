import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Exemplo6 {
	public static void main(String[] args) {

		System.out.println("atualizar informacoes no BD");

		Cliente cliente =  new Cliente(9, "Carlao", "xxx999", "juvenal@email");
		
		try {
			
			String urlPostgres = "jdbc:postgresql://localhost:5432/postgres";
			String urlMysql = "jdbc:mysql://localhost:3306/trainning";
			String usuario = "postgres";
			String senha = "trocar";
			
			Connection conexao = DriverManager.getConnection(urlPostgres, usuario, senha);
			conexao.setAutoCommit(false);
			
			System.out.println("Conexao com sucesso");
			
			String sql = "update trainning.cliente set nome=?, cpf=?, email=? where id = ?";
			PreparedStatement stm = conexao.prepareStatement(sql); 
		
			stm.setString(1, cliente.getNome());//va na primeira interrogacao e coloque esse valor
			stm.setString(2, cliente.getCpf());
			stm.setString(3, cliente.getEmail());
			stm.setInt(4, cliente.getId());
			
			stm.executeUpdate();
			conexao.commit();
			
			System.out.println("Fechando a conexao");
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
