
public class Cliente extends Pessoa {

	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Cliente imprimindo");
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [cpf=" + cpf + "]";
	}

	
	
}
