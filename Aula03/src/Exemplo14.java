import java.util.Scanner;

public class Exemplo14 {
	public static void main(String[] args) {

		/*
		 * ler o dia da semana e imprimir o nome por extenso. 1 - domingo 2 -
		 * segunda-feira ... 7 - sabado
		 */

		
		System.out.print("Entre com o dia da semana: ");
		
		//ligacao com o teclado da sua maquina
		Scanner teclado = new Scanner(System.in);
		
		byte diaSemana = teclado.nextByte();

		if (diaSemana == 1)
			System.out.println("Domingo");
		else if (diaSemana == 2)
			System.out.println("Segunda-feira");
		else if (diaSemana == 3)
			System.out.println("Terça-feira");
		else if (diaSemana == 4)
			System.out.println("Quarta-feira");
		else if (diaSemana == 5)
			System.out.println("Quinta-feira");
		else if (diaSemana == 6)
			System.out.println("Sexta-feira");
		else
			System.out.println("Sabado");

	}
}
