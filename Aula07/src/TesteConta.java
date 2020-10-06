
public class TesteConta {

	public static void main(String[] args) {
		
		
		//criando o cliente
		Cliente cliente = new Cliente("erico torres","123456789");
		cliente.setEmail("ericotorres76@gmail.com");
		
		Conta conta = new Conta();
		conta.setCliente(cliente);
		conta.setSaldo(100);

		Conta conta2 = new Conta();
		conta2.setCliente(cliente);
		conta2.setSaldo(200);

		System.out.println(conta);
		conta.sacar(50);
		conta.sacar(50);
		conta.depositar(25);
		
		System.out.println("informacoes da conta 2");
		System.out.println(conta2);
		
		cliente.setNomeCliente("juvenal torres");
		System.out.println(conta);
		System.out.println(conta2);
		
		
		
	}

}
