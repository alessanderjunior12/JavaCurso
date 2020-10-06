public class Exemplo11 {
	public static void main(String[] args) {

		//ler o nome
		//ler quatro notas do aluno e 
		//ao final escrever o nome, a media e a situacao do aluno
		//conforma a seguinte regra: media > ou = 7 = APROVADO, 
		//Media < 7, reprovado
	
		String nome = "Erico";
		float n1, n2, n3, n4, media;
		n1 = 10.0f;
		n2 = 5.5f;
		n3 = 8.35f;
		n4 = 9.32f;
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.print(nome + " teve media " + media + " e foi ");
		
		if(media >= 7 ) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
		
		
		
		
		
	}
}
