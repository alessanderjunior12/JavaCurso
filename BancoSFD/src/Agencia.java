
public class Agencia {

	private int numero;
	private String nome;
	private Gerente gerente;
	private Endereco endereco;
	
	public Agencia(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public Gerente getGerente() {
		return gerente;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", nome=" + nome + ", gerente=" + gerente + ", endereco=" + endereco + "]";
	}

	
	
	
	
}
