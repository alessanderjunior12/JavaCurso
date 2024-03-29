
public abstract class Pessoa {

	private String nome;
	private String rg;

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

	public abstract void imprime();

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + "]";
	}
	
	
}
