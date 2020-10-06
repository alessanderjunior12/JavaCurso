import java.util.Scanner;

public class Exemplo8 {
	public static void main(String[] args) {

		String continuar = "S";
		
		while (continuar.equalsIgnoreCase("S")) {

			Scanner teclado = new Scanner(System.in);

			System.out.print("Qual o nome do aluno? ");
			String nome = teclado.nextLine();

			float n1, n2, n3, n4, media;

			System.out.print("Entre com a 1a. nota: ");
			n1 = teclado.nextFloat();

			System.out.print("Entre com a 2a. nota: ");
			n2 = teclado.nextFloat();

			System.out.print("Entre com a 3a. nota: ");
			n3 = teclado.nextFloat();

			System.out.print("Entre com a 4a. nota: ");
			n4 = teclado.nextFloat();

			media = (n1 + n2 + n3 + n4) / 4;

			System.out.print(nome + " teve media " + media + " e foi ");

			if (media >= 7) {
				System.out.println("aprovado");
			} else {
				System.out.println("reprovado");
			}

			
			
			//antes de fechar o bloco while, pergunto se desejo repetir a acao...
			
			System.out.print("Deseja continuar (S/N) ? ");
			continuar = teclado.next();
			
		}
		
		System.out.println("Fim do programa");

	}
}
