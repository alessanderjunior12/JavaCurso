public class Exemplo9 {

	public static void main(String args[]) {


		int matriz[][] = new int[5][];
		matriz[0] = new int[1];
		matriz[1] = new int[2];
		matriz[2] = new int[3];
		matriz[3] = new int[4];
		matriz[4] = new int[5];
	


		System.out.println("qtd linhas:" + matriz.length);
		
		System.out.println("qtd col linha 1 " + matriz[0].length);
		System.out.println("qtd col linha 2 " + matriz[1].length);
		System.out.println("qtd col linha 3 " + matriz[2].length);
		System.out.println("qtd col linha 4 " + matriz[3].length);
		System.out.println("qtd col linha 5 " + matriz[4].length);

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("qtd col linha " + (i+1) + matriz[i].length);
		}
		
		
				
	}

}
