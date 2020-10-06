
public final class Endereco {

	private String rua;
	private String numero;

	public Endereco(String rua, String numero) {
		super();
		this.rua = rua;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + "]";
	};

}
