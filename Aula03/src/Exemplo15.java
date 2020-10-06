import java.util.Scanner;

public class Exemplo15 {
	public static void main(String[] args) {

		//ler o nome
		//ler quatro notas do aluno e 
		//ao final escrever o nome, a media e a situacao do aluno
		//conforma a seguinte regra: media > ou = 7 = APROVADO, 
		//Media < 7, reprovado
	
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
		
		if(media >= 7 ) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
		
		
		
		
		
	}
}
