
public class Teste03 {

	public static void main(String[] args) {
		
		
		Individuo i = new Individuo("nome","cpf","email");
		//metodos da interface IAtleta
		i.correr();
		i.repousar();
		
		
		//metodos da interface Ianalista
		i.analisar();
		i.desenvolver();
		
		//metodos da classe abastract Pessoa
		i.saudar();
		
	
		EmpresaDesenvolvimento e =  new EmpresaDesenvolvimento();
		e.entrada(i);
		
		
	}
	
	
	
	
	
}
