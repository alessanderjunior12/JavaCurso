package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TesteList2 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("nome1 ananias", 10,"cpf1");
		Pessoa p2 = new Pessoa("nome2 jose", 10,"cpf2");
		Pessoa p3 = new Pessoa("nome3 pedro", 10,"cpf3");
		
		List<Pessoa> lista  = new ArrayList<Pessoa>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		Pessoa p2_ =  new Pessoa("nome francisco", 30,"cpf2");
		
		System.out.println(lista.contains(p2_));
		
		lista.add(new Pessoa("nome3 pedro", 10,"cpf3"));
		
		
		
	}
}
