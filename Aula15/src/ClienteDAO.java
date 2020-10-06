import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

	private Connection conexao = null;

	public Cliente inserir(Cliente c) throws Exception {
		
		abrirConexao();
		
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
		
		fecharConexao();
		
		return c;
		
		
	}

	public List<Cliente> consultarTodos() throws Exception {

		abrirConexao();

		Statement stm = conexao.createStatement();

		ResultSet rs = stm.executeQuery("select * from trainning.cliente");

		List<Cliente> listaCliente = new ArrayList<Cliente>();

		while (rs.next()) {

			Cliente cliente = new Cliente();

			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setCpf(rs.getString("cpf"));
			cliente.setEmail(rs.getString("email"));

			listaCliente.add(cliente);
		}

		fecharConexao();

		return listaCliente;

	}

	public Cliente consultar(int id) throws Exception {

		abrirConexao();

		PreparedStatement stm = conexao.prepareStatement("select * from trainning.cliente where id = ?");
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();

		Cliente cliente = null;

		if (rs.next()) {
			cliente = new Cliente();
			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setCpf(rs.getString("cpf"));
			cliente.setEmail(rs.getString("email"));
		}

		fecharConexao();

		return cliente;

	}

	public void alterar(Cliente cliente) throws Exception {

		abrirConexao();

		String sql = "update trainning.cliente set nome=?, cpf=?, email=? where id = ?";
		PreparedStatement stm = conexao.prepareStatement(sql);

		stm.setString(1, cliente.getNome());// va na primeira interrogacao e coloque esse valor
		stm.setString(2, cliente.getCpf());
		stm.setString(3, cliente.getEmail());
		stm.setInt(4, cliente.getId());

		stm.executeUpdate();

		fecharConexao();
	}

	public void apagar(int idCliente) throws Exception {

		abrirConexao();

		String sql = "delete from trainning.cliente where id = ?";
		PreparedStatement stm = conexao.prepareStatement(sql);

		stm.setInt(1, idCliente);

		stm.executeUpdate();

		fecharConexao();

	}

	private void abrirConexao() throws Exception {
		String urlPostgres = "jdbc:postgresql://localhost:5432/postgres";
		String urlMysql = "jdbc:mysql://localhost:3306/trainning";
		String usuario = "postgres";
		String senha = "trocar";

		this.conexao = DriverManager.getConnection(urlPostgres, usuario, senha);

		System.out.println("Conexao com sucesso");

	}

	private void fecharConexao() throws Exception {
		System.out.println("Fechando a conexao");
		conexao.close();

	}

}
