
public class Funcionario extends Pessoa {
	
	private String dataAdmissao;
	private double salario;
	
	public Funcionario(String nome, String cpf, String email) {
		super( nome,  cpf,  email); //construtor de pessoa
		System.out.println("construtor de funcionario");
	}
	
	

	public Funcionario(String nome, String cpf, String email, String dataAdmissao, double salario) {
		super(nome, cpf, email);//construtor de pessoa
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}



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

	@Override
	public String toString() {
		return  super.toString() + "Funcionario [dataAdmissao=" + dataAdmissao + ", salario=" + salario + "]";
	}



	@Override
	public void saudar() {
		System.out.println("Funcionario saudando...");
		
	}
	
	
	
	

}
