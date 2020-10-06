package asertivas;

public class TesteBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Conta conta1 = banco.abrirConta(TipoConta.CONTA_CORRENTE);
		System.out.println("conta corrente aberta com sucesso");
		
		Conta conta2 = banco.abrirConta(TipoConta.CONTA_POUPANCA);
		System.out.println("conta poupanca aberta com sucesso");
		
		
	}
	
}
