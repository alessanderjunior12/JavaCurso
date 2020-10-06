import java.util.List;

public class TesteClienteDAO {

	public static void main(String[] args) {
		
		try {
			ClienteDAO clienteDAO = new ClienteDAO(); 
					
			//listar todos os clientes que estao cadastrados
			List<Cliente> listaLida = clienteDAO.consultarTodos();
			for (Cliente cliente : listaLida) {
				System.out.println(cliente);
			}
			
			//incluir
			
			//alterar
			Cliente c = clienteDAO.consultar(11);
			c.setEmail("email11@gmail");
			clienteDAO.alterar(c);
			
			//excluir
			clienteDAO.apagar(6);
			
			//consultar um especifico
			System.out.println(clienteDAO.consultar(11));

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
}
