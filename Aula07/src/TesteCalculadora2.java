
public class TesteCalculadora2 {

	public static void main(String[] args) {

		Calculadora2 calc = new Calculadora2("ericoCalc");
		System.out.println(calc.getNomeCalculadora());
		
		
		calc.soma(25,25);
		calc.soma(25,25,25);
		calc.soma(25l,25,25,3,5,8,9,12);
		
		byte n1 =2;
		byte n2 =4;
		calc.soma(n1, n2);
		
		calc.soma((byte)10,(byte)10);
		calc.soma(12.3f, 9.0f);

	}

}
