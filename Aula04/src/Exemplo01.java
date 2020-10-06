import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {

		/*
		 * ler o dia da semana e imprimir o nome por extenso. 1 - domingo 2 -
		 * segunda-feira ... 7 - sabado
		 */

		System.out.print("Entre com o dia da semana: ");

		// ligacao com o teclado da sua maquina
		Scanner teclado = new Scanner(System.in);

		byte diaSemana = teclado.nextByte();

		switch (diaSemana) {
		default:
			System.out.println("Voce informou um dia da semana invalido");
			break;
		case 1:
			System.out.println("Domingo");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terca-feira");
			break;
		
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		}

	}
}
