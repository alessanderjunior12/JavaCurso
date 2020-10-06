
public final class Funcionario extends Pessoa {

	
	private String carteiraProfissional;
	private double salario;
	private String dataAdmissao;
	
	public Funcionario(String nome, String rg, Endereco endereco) {
		super(nome, rg, endereco);
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String rg, Endereco endereco, String carteiraProfissional, double salario, String dataAdmissao) {
		super(nome, rg, endereco);
		this.carteiraProfissional = carteiraProfissional;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public String getCarteiraProfissional() {
		return carteiraProfissional;
	}

	public void setCarteiraProfissional(String carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String toString() {
		return super.toString() + "Funcionario [carteiraProfissional=" + carteiraProfissional + ", salario=" + salario + ", dataAdmissao="
				+ dataAdmissao + "]";
	}

	

}
