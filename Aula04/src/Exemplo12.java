public class Exemplo12 {
	public static void main(String[] args) throws Exception {

		while(true) {
			for(int dia = 1; dia < 32; dia ++) {
				for (int hora = 0; hora < 24; hora++) {
					for (int minutos = 0; minutos < 60; minutos++) {
						for (int segundos = 0; segundos < 60; segundos++) {
							System.out.println("dia " + dia + " - " + hora + ":" + minutos + ":" + segundos);
							Thread.sleep(1000);
						}
					}
				}
				
			}
			
		}
		

	}
}
