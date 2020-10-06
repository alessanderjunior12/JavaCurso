package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TesteList4 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("nome1 ananias", 10,"cpf1");
		Pessoa p2 = new Pessoa("nome2 jose", 10,"cpf2");
		Pessoa p3 = new Pessoa("nome3 pedro", 10,"cpf3");
		Pessoa p4 = new Pessoa("nome2 jose", 10,"cpf2");
		Pessoa p5 = new Pessoa("nome3 pedro", 10,"cpf3");
		
		Set<Pessoa> lista = new HashSet<Pessoa>(); //nao permite duplicidade
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}
}
