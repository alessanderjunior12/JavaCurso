public class Exemplo7 {
	public static void main(String[] args) {

		//enquanto o while pode nao executar nenhuma vez, o
		// do/ while, executara ao menos uma vez, pois o teste acontece ao final do bloco
		
		int x = 10;

		do {
			System.out.println("Entrei");
			x++;
		} while(x < 10);
		
		
	}
}
