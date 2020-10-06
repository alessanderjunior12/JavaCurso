import java.util.ArrayList;
import java.util.List;

public class Lista1 {

	public static void main(String[] args) {
		
		List lista =  new ArrayList();
		Pessoa p1 = new Pessoa("erico","rg1","cpf1");
		Pessoa p2 = new Pessoa("erico2","rg2","cpf2");
		Pessoa p3 = new Pessoa("erico3","rg3","cpf3");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
	
		for (int i = 0; i < lista.size(); i++) {
			
			Pessoa p = (Pessoa)lista.get(i);
			System.out.println(p.getNome());
			System.out.println(p.getCpf());
			System.out.println(p.getRg());
			
		}
		
		
	}
	
}
