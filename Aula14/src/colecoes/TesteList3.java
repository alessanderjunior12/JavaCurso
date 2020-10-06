package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TesteList3 {

	public static void main(String[] args) {

		List<Pessoa> outraLista  = new ArrayList<Pessoa>();

		for (int i = 0; i < 30; i++) {
			outraLista.add( new Pessoa ("outra pessoa" +i ,i, "cpf"+i));
		}
		System.out.println(outraLista.size());

		
		List<Pessoa> lista  = new ArrayList<Pessoa>();
		for (int i = 0; i < 100; i++) {
			lista.add( new Pessoa ("pessoa" +i ,i, "cpf"+i));
		}
		System.out.println(lista.size());

		
		for (int i = 0; i < lista.size(); i++) {
			Pessoa pessoa = lista.get(i);
			System.out.println(pessoa);
		}
		
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}

		for (Pessoa pessoa : outraLista) {
			System.out.println(pessoa);
		}
		
		lista.addAll(outraLista);
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toCSV());
		}
		System.out.println(lista.size());
		
		System.out.println(lista.containsAll(outraLista));
		
	}
}
