
public class Funcionario extends Pessoa {

	private String dataAdmissao;
	private double salario;
	private String cargo;

	public String getDataAdmissao() {
		
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [dataAdmissao=" + dataAdmissao + ", salario=" + salario + ", cargo=" + cargo + "]";
	}

}
