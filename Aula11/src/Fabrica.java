
public class Fabrica {

	public Funcionario gerar(String nome) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		return funcionario;
	}

}
