public class Exemplo13 {
	public static void main(String[] args) {

		/*
		 * ler o dia da semana e imprimir o nome por extenso. 1 - domingo 2 -
		 * segunda-feira ... 7 - sabado
		 */

		byte diaSemana = 4;

		if (diaSemana == 1)
			System.out.println("Domingo");
		else if (diaSemana == 2)
			System.out.println("Segunda-feira");
		else if (diaSemana == 3)
			System.out.println("Ter�a-feira");
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
