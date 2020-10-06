
public class Exemplo6 {

	public static void main(String[] args) {

		String nome1 = "hamburguer";
		//burguer
		System.out.println(nome1.substring(3));
		//burg
		System.out.println(nome1.substring(3,7));
		
		//tamanho ?
		System.out.println(nome1.length());
		
		//trocar o h minusculo por maiusculo
		System.out.println(nome1.replace('h', 'H'));
		
		//quantas vezes a letra u aparece
		System.out.println(nome1.indexOf("u"));
		System.out.println(nome1.indexOf("u",5));
		
		int contador = 0;
		for(int x=0; x < nome1.length(); x++) {
			if(nome1.charAt(x)=='u') {
				contador++;
			}
		}
		System.out.println(contador + " letras U");
		
		//contar quantas vezes a letra u aparece sem usar for
		
		
		
	}
}
