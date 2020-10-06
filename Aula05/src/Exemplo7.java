public class Exemplo7 {

	public static void main(String args[]) {


		int matriz[][] = new int[4][6];

		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				matriz[linha][coluna] = (int) (Math.random()*60);
			}
		}

		
		System.out.println("Mostrando o que foi preenchido");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print(matriz[linha][coluna] + ",");
			}
			System.out.println();
		}
		
				
	}

}
