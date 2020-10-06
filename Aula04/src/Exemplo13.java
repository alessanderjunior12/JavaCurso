import java.util.Scanner;

public class Exemplo13 {
	public static void main(String[] args)  {
		
		
		Scanner teclado = new Scanner(System.in);
		
		//dfinicao do alarme
		System.out.print("Indique a hora do alarme: ");
		int ha = teclado.nextInt();
		
		System.out.print("Indique o minuto do alarme: ");
		int ma = teclado.nextInt();

		System.out.print("Indique o segundo do alarme: ");
		int sa = teclado.nextInt();

		while(true) {
			for(int dia = 1; dia < 32; dia ++) {
				for (int hora = 0; hora < 24; hora++) {
					for (int minutos = 0; minutos < 60; minutos++) {
						for (int segundos = 0; segundos < 60; segundos++) {
							System.out.println("dia " + dia + " - " + hora + ":" + minutos + ":" + segundos);
							
							if(ha == hora && ma == minutos && sa == segundos) {
								System.out.println("bzzz bzzz bzzz");
								System.exit(0);
							}
							
						}
					}
				}
				
			}
			
		}
		

	}
}
