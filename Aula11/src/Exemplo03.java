
import static br.com.trainning.ClasseC.*;
import br.com.trainning.ClasseC;

public class Exemplo03 {

	public static void main(String[] args) {
		
		//para ter acesso a metodos estaticos, sem a necessidade de chamar a classe, 
		//utilizamos o import static
		metodo1();
		metodo2();
		
		//mas se precisar instanciar a classe depois, entao tem que fazer o import da classe
		ClasseC c = new ClasseC();
		
	}
	
}
