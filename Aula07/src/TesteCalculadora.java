
public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc =  new Calculadora();
		
		int r = calc.somar(1,2);
		
		System.out.println(r);
		
		System.out.println(calc.somar(2,  2,  3));
		
		System.out.println(calc.somar(2.2f,  9.2f));
		
	}
	
}
