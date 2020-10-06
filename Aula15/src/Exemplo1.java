import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exemplo1 {
	public static void main(String[] args) {

		try {
			
			String urlPostgres = "jdbc:postgresql://localhost:5432/postgres";
			String urlMysql = "jdbc:mysql://localhost:3306/trainning";
			String usuario = "postgres";
			String senha = "trocar";
			
			Connection conexao = DriverManager.getConnection(urlPostgres, usuario, senha);
			
			System.out.println("Conexao com sucesso");
			//select * from trainning.cliente
			
			Statement stm = conexao.createStatement(); //mesa de trabalho
			
			ResultSet rs =  stm.executeQuery("select * from trainning.cliente");
			
			//ficara no loop enquanto existirem registros a serem lidos
			while(rs.next()) {
				
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("cpf"));
				System.out.println(rs.getString("email"));
				System.out.println("**************************");
			}
			
			System.out.println("Acabei de ler!");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
}
