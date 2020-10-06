import java.util.Scanner;

public class Exemplo2 {

	public static void main(String args[]) {

		float nota[] = new float[10]; 

		for(int x = 0; x < nota.length; x++) {
			Scanner tec = new Scanner(System.in);
			System.out.println("Entre com a nota " + (x+1) + " :");
			nota[x] = tec.nextFloat();
		}
		
		
		System.out.println(nota.length);
		
		for(int x = 0; x < nota.length; x++) {
			System.out.println(nota[x]);
		}
		
		
	}

}
