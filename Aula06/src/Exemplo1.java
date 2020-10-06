
public class Exemplo1 {
	
	public static void main(String[] args) {
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.cpf = 123456789;
		aluno1.nome = "Alessander Jose da Silva Xavier";
		aluno1.email = "ajsx@gmail.com";
		
		Aluno aluno2 = new Aluno();
		aluno2.cpf = 11111111;
		aluno2.nome = "Lu Ferreira da Silva";
		aluno2.email = "lfs@gmail.com";
		

		System.out.println(aluno1.nome);
		System.out.println(aluno2.nome);
		
	}

}
