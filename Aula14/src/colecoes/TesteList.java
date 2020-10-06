package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("nome1", 10,"cpf1");
		Pessoa p2 = new Pessoa("nome2", 10,"cpf2");
		Pessoa p3 = new Pessoa("nome3", 10,"cpf3");
		
		List<Pessoa> lista  = new ArrayList<Pessoa>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		System.out.println(lista.size());
		System.out.println(lista.contains(p2));
		System.out.println(lista.indexOf(p1));
		lista.remove(1);
		System.out.println(lista.size());
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toCSV());
		}
		
	}
}
