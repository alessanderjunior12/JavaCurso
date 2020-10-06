
public class Carro {

	private String chassi;
	private String cor;
	private String placa;
	private int numeroPortas;

	public Carro(String chassi) {
		this.chassi = chassi;
	}

	

	public Carro(String chassi, String cor, String placa, int numeroPortas) {
		
		this.chassi = chassi;
		this.cor = cor;
		this.placa = placa;
		this.numeroPortas = numeroPortas;
	}



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

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	@Override
	public String toString() {
		return "Carro [chassi=" + chassi + ", cor=" + cor + ", placa=" + placa + ", numeroPortas=" + numeroPortas + "]";
	}

	// setters e getters

	
	
}
