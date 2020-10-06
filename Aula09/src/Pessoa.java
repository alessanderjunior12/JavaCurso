
public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String email;
	private String cor;
	
	public Pessoa(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		System.out.println("construtor da classe pessoa...");
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getCor() {
		return cor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", cor=" + cor + "]";
	}


	public abstract void saudar();

	
}
