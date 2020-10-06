
public class Exemplo02 {

	public static void main(String[] args) {
		
		Fabrica fabrica = new Fabrica();
		Funcionario f = (Funcionario)fabrica.gerar("erico");
		
		System.out.println(f);
		
		Fabrica2 f2 = new Fabrica2();
		Gerente c = f2.gerar("Gerente cliente");
		System.out.println(c);
		
		
		
	}
}
