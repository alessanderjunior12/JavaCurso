package asertivas;

import java.util.Date;

public class TesteAsser01 {
	
	public static void main(String[] args) {
		
		
		Date data = null;//new Date();
		
		//para este trecho funcionar, no momneto da execucao do codigo, incluir
		// -ea no VM Arguments, ou java -ea <nomeClasse>
		assert data != null : "data esta nula!!!";
		
		System.out.println("Fim");
		
		
	}

}
