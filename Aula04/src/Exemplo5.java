import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {

		
		String continuar = "S";
		
		while (continuar.equals("S")) {
			
			System.out.println("Oi");

			Scanner teclado = new Scanner(System.in);//ligacao com o teclado
			
			System.out.print("Deseja continuar (S/N) ? ");
			continuar = teclado.next();
			
			
		}
		
		System.out.println("Acabou!");
		

	}
}
