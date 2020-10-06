
public class Teste01 {
	
	public static void main(String[] args) {
		
		//Pessoa p =new Pessoa("n1", "cpf", "email"); nao pode ser instanciado porque é uma classe abstrata
		
		
		
		Funcionario f =  new Funcionario("nome func", "cpf001", "email1@gmail");
		f.setDataAdmissao("01/01/2010");
		f.setSalario(50);
		f.setCor("branca");
		
		System.out.println(f.toString());

		Funcionario f2 =  new Funcionario("nome func", "cpf001", "email1@gmail", "01/01/2020", 100);
		f2.setCor("parda");
		System.out.println(f2.toString());
		
		Cliente c = new Cliente("nome cli", "cpf002", "email2@gmail", false);
		c.setCor("negra");
		System.out.println(c.toString());

		f.saudar();
		f2.saudar();
		c.saudar();
		
		
	}

}
