
public class Teste02 {

	public static void main(String[] args) {
		
		//PaiAbstract p = new PaiAbstract(); nao pode pq a classe é abstract
		//FilhoConcreto f =  new FilhoConcreto();nao pode pq a classe é abstract
		Neto n = new Neto();
		n.andar();
		n.falar();
		n.correr();
		
	}
}
