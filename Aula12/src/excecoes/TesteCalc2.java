package excecoes;

public class TesteCalc2 {

	public static void main(String[] args) {
		CalculadoraComExcecao calc =  new CalculadoraComExcecao();

		
		try {
			
			System.out.println(calc.dividir(10,0));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
			
		}
		
		
		System.out.println("final do programa");

	}

}
