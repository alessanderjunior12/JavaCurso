package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;


public class TesteList6 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("nome1 ananias", 10,"cpf4");
		Pessoa p2 = new Pessoa("nome2 jose", 10,"cpf1");
		Pessoa p3 = new Pessoa("nome3 pedro", 10,"cpf3");
		
		Deque<Pessoa> fila = new ArrayDeque<Pessoa>();
		fila.add(p1);
		fila.add(p2);
		fila.add(p3);
		
		for (Pessoa pessoa : fila) {
			System.out.println(pessoa);
		}
		
		
		System.out.println("**********************************");
		
		fila.addFirst(new Pessoa("prioridade", 10,"cpf5"));

		for (Pessoa pessoa : fila) {
			System.out.println(pessoa);
		}
		
		System.out.println("**********************************");
		
		fila.addLast(new Pessoa("sem prioridade", 10,"cpf6"));

		for (Pessoa pessoa : fila) {
			System.out.println(pessoa);
		}
		
		System.out.println("**********************************");
		System.out.println(fila.removeFirst());
		System.out.println("**********************************");
		
		for (Pessoa pessoa : fila) {
			System.out.println(pessoa);
		}
		System.out.println("**********************************");
		System.out.println(fila.removeFirst());
		System.out.println("**********************************");
		
		for (Pessoa pessoa : fila) {
			System.out.println(pessoa);
		}
		
		while(!fila.isEmpty()) {
			System.out.println("**********************************");
			System.out.println(fila.removeFirst());
			System.out.println("**********************************");
			
			for (Pessoa pessoa : fila) {
				System.out.println(pessoa);
			}
			
		}
		
	}
}
