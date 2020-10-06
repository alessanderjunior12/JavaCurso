import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Exemplo5 {
	public static void main(String[] args) {

		System.out.println("apagando informacoes no BD");

		int idCliente = 8;
		
		try {
			
			String urlPostgres = "jdbc:postgresql://localhost:5432/postgres";
			String urlMysql = "jdbc:mysql://localhost:3306/trainning";
			String usuario = "postgres";
			String senha = "trocar";
			
			Connection conexao = DriverManager.getConnection(urlPostgres, usuario, senha);
			
			System.out.println("Conexao com sucesso");
			
			String sql = "delete from trainning.cliente where id = ?";
			PreparedStatement stm = conexao.prepareStatement(sql); 
			
			stm.setInt(1, idCliente);
			
			stm.executeUpdate();
			
			System.out.println("Fechando a conexao");
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
