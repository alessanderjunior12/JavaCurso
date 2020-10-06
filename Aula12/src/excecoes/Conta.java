package excecoes;

public class Conta {
	
	private double saldo;
	private double limite;
	
	public double sacar(double valor) throws SaldoInsuficienteException,LimiteExcedidoException {
		
		System.out.println("sacando..." + valor);
		if(valor <= (saldo+limite)) {
			saldo-=valor;
		} else {
			
			SaldoInsuficienteException e = new SaldoInsuficienteException("Saldo insuficiente");
			throw e;
			
		}
		System.out.println("saldo atual:" + saldo);
		
		if(saldo<0) {
			LimiteExcedidoException l = new LimiteExcedidoException("Vc excedeu seu limite");
			throw l;
		}
		
		return valor;
	}
	
	public void depositar(double valor) {
		System.out.println("depositando...");
		saldo+=valor;
		System.out.println("saldo atual:" + saldo);
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}

}
