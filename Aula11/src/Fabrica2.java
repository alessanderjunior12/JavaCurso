
public class Fabrica2 extends Fabrica{

	public Gerente gerar(String nome) {
		Gerente c = new Gerente();
		c.setNome(nome);
		return c;
	}

}
