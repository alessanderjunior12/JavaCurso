public class Exemplo12 {
	public static void main(String[] args) {

		//ler o nome
		//ler quatro notas do aluno e 
		//ao final escrever o nome, a media e a situacao do aluno
		//conforma a seguinte regra: media > ou = 7 = APROVADO, 
		//Media >=5 e < 7, recuperacao, senao reprovado
	
		String nome = "Erico";
		float n1, n2, n3, n4, media;
		n1 = 0.0f;
		n2 = 5.5f;
		n3 = 8.35f;
		n4 = 1.32f;
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.print(nome + " teve media " + media + " e foi ");
		
		if(media >= 7 ) {
			System.out.println("aprovado");
		} else 
			if (media >= 5 && media < 7) {
				System.out.println("recuperacao");
			} else {
					System.out.println("reprovado");
				   }
		
		
		
		
		
	}
}
