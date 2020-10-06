package excecoes;

public class ExemploConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.depositar(100);
		conta.setLimite(10);

		try {

			conta.sacar(50);
			conta.sacar(60);

		} catch (SaldoInsuficienteException e) {

			System.out.println("Desculpe! " + e.getMessage());

		} catch (LimiteExcedidoException e) {

			
			System.out.println("Desculpe! " + e.getMessage());

		}

	}

}
