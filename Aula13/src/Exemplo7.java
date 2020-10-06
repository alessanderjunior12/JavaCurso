
public class Exemplo7 {

	public static void main(String[] args) {

		long tempoInicial =  System.currentTimeMillis();  
		
		String texto = "A";
		for (int i = 0; i < 20000; i++) {
			texto += "AAA";
		}
		System.out.println(texto.length());
		
		long tempoFinal =  System.currentTimeMillis();  

		System.out.println((tempoFinal-tempoInicial) + "ms");
		
		//////////////////////////////////////////////////
		tempoInicial =  System.currentTimeMillis();

		StringBuffer sb =  new StringBuffer("A");
		for (int i = 0; i < 2000000; i++) {
			sb.append("AAA");
		}
		System.out.println(sb.length());
		
		
		tempoFinal =  System.currentTimeMillis();  
		System.out.println((tempoFinal-tempoInicial) + "ms");

		//////////////////////////////////////////////////
		tempoInicial =  System.currentTimeMillis();

		StringBuilder sb1 =  new StringBuilder("A");
		for (int i = 0; i < 2000000; i++) {
			sb1.append("AAA");
		}
		System.out.println(sb1.length());
		
		
		tempoFinal =  System.currentTimeMillis();  
		System.out.println((tempoFinal-tempoInicial) + "ms");
		
	}
}
