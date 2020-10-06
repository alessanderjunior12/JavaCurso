
public class Funcionario extends Pessoa {

	private String ctps;
	private double salario;

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public void imprime() {

		System.out.println("funcionario imprimindo...");

	}

	@Override
	public String toString() {
		return super.toString() + " Funcionario [ctps=" + ctps + ", salario=" + salario + "]";
	}
	
	

}
