package excecoes;

public class TesteCalc {

	public static void main(String[] args) {
		Calculadora calc =  new Calculadora();
		System.out.println(calc.dividir(10,0));
		try {
			System.out.println(calc.dividir(10,5));
			System.out.println(calc.dividir(10,0));
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("Deu o erro: " + e.getMessage());
			//System.exit(1);
			
		}
		
		
		System.out.println("final do programa");

	}

}
