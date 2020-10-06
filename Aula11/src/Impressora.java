
public class Impressora {
	
	public void receberImpressao(Pessoa p) {
		System.out.println(p.toString());

		
		if(p instanceof Cliente) {
			System.out.println("é um cliente");
			
			//fazendo o casting. podemos voltar a ter acesso aos metodos
			// da classe original
			Cliente c = (Cliente)p;
			System.out.println("cpf: " + c.getCpf());
			
		} else
			
			if(p instanceof Funcionario) {
				System.out.println("é um funcionario");
				Funcionario f = (Funcionario)p;
				System.out.println(f.getCtps());
			}

		
	}
	

}
