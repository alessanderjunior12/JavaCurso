package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class TesteList5 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("nome1 ananias", 10,"cpf4");
		Pessoa p2 = new Pessoa("nome2 jose", 10,"cpf1");
		Pessoa p3 = new Pessoa("nome3 pedro", 10,"cpf3");
		Pessoa p4 = new Pessoa("nome2 jose", 10,"cpf0");
		Pessoa p5 = new Pessoa("nome2 jose", 10,"cpf0");
		Pessoa p6 = new Pessoa("nome3 pedro", 10,"cpf2");
		
		Set<Pessoa> lista = new TreeSet<Pessoa>(); //nao permite duplicidade e mantem a ordenacao
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		lista.add(p6);

		lista.remove(p4);
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}
}
