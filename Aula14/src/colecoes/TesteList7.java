package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteList7 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("nome1 ananias", 10,"cpf4");
		Pessoa p2 = new Pessoa("nome2 jose", 10,"cpf1");
		Pessoa p3 = new Pessoa("nome3 pedro", 10,"cpf3");

		Map<String, Pessoa> mapa =  new HashMap<String, Pessoa>();
		
		mapa.put("ana", p1);
		mapa.put("ze", p2);
		mapa.put("pezao", p3);
		
		System.out.println(mapa.size());
		
		//para recuperar um ellemento, preciso da chave
		Pessoa p = mapa.get("ze");
		System.out.println(p);
		
		//conjunto de chaves
		Set<String> conjuntoChaves = mapa.keySet();
		for (String chave : conjuntoChaves) {
			System.out.println("procurando o elemento com a chave [" + chave + "]");
			Pessoa pessoaEncontrada = mapa.get(chave);
			System.out.println(pessoaEncontrada);
			
		}
		
		
	}
}
