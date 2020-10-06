package asertivas;

public class Banco {

	public Conta abrirConta(TipoConta tipo) {
		
		Conta conta = null;
		
		if(tipo == TipoConta.CONTA_CORRENTE) {
			conta =  new ContaCorrente();
		}
		
		assert conta!=null : "conta esta nula e nao deveria"; 
		
		return conta;
	}
	
}
