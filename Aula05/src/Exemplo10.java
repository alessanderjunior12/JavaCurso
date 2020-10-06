public class Exemplo10 {

	public static void main(String args[]) {

		String nomes[] = new String[10];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = "nome" + i;
			
		}
		
		for (int i = 0; i < nomes.length; i++) {
			String n = nomes[i];
			System.out.println(n);
		}
		
		for (String n : nomes) {
			System.out.println(n);
		}
		
				
	}

}
