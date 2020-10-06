
public abstract class Veiculo {

	private String chassi;
	private String cor;
	private String placa;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public abstract void buzinar();

	public void acelerar() {
		System.out.println("acelerando...");
	}

}
