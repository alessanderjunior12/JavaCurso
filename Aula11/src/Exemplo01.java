
public class Exemplo01 {

	public static void main(String[] args) {
		
		Cliente c1 =  new Cliente();
		//c1.imprime();
		c1.setCpf("cpf123");
		
		Pessoa p1 = c1;
		//p1.imprime();
		//System.out.println(p2.getCpf()); //nao acessivel		
		
		Cliente c2 = (Cliente)p1;
		//System.out.println(c2.getCpf());	
		
		Funcionario f = new Funcionario();
		f.setCtps("ctps01");
		
		
		Impressora i =  new Impressora();
		i.receberImpressao(c1);
		i.receberImpressao(f);
		
				
		
	}
	
}
