public class Exemplo8 {
	public static void main(String[] args) {

		int x = 9;
		int y = 5;

		String resultado;
		
		resultado = (x >= y) ? 
				"x é maior ou igual a y" : //entao
					"x é menor ou igual a y"; //senao
		
		System.out.println(resultado);
	}
}
