public class Exemplo8 {
	public static void main(String[] args) {

		int x = 9;
		int y = 5;

		String resultado;
		
		resultado = (x >= y) ? 
				"x � maior ou igual a y" : //entao
					"x � menor ou igual a y"; //senao
		
		System.out.println(resultado);
	}
}
