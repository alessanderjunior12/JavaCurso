
public class Teste {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		Moto cg =  new Moto();
		Caminhao mercedez710D = new Caminhao();
		Lancha lancha =  new Lancha();
		
		Posto posto = new Posto();
		
		posto.abastecer(fusca);
		posto.abastecer(cg);
		posto.abastecer(mercedez710D);
		posto.abastecer(lancha);
		
		
		
	}
}
