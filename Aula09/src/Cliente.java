
public class Cliente extends Pessoa {

	private boolean especial;

	public Cliente(String nome, String cpf, String email) {
		super( nome,  cpf,  email); //construtor de pessoa
		System.out.println("contrutor de Cliente");
	}
	
	

	public Cliente(String nome, String cpf, String email, boolean especial) {
		super(nome, cpf, email); //tem que ser a primeira linha!!!
		this.especial = especial;
	}



	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [especial=" + especial + "]";
	}



	@Override
	public void saudar() {
		System.out.println("ola, sou o cliente...");
		
	}

}
