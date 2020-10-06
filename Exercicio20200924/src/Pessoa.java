
public class Pessoa {

	private String nome;
	private String rg;
	private Endereco endereco;

	public Pessoa(String nome, String rg, Endereco endereco) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + "]" + endereco.toString();
	}

}
