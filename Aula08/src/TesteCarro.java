
public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro.buzinar();
		
		Carro c1 = new Carro("carro1", "preto", "placa1");
		Carro c2 = new Carro("carro2", "prata", "placa2");
		Carro c3 = new Carro("carro3", "amarelo", "placa3");
		
		System.out.println(c1);
		c1.buzinar();
		
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("Vel Max. c1 " + c1.getVelocidadeMaxima());
		System.out.println("Vel Max. c2 " + c2.getVelocidadeMaxima());
		System.out.println("Vel Max. c3 " + c3.getVelocidadeMaxima());
		
		c1.setCor("rosa");
		c1.setVelocidadeMaxima(80);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("Vel Max. c1 " + c1.getVelocidadeMaxima());
		System.out.println("Vel Max. c2 " + c2.getVelocidadeMaxima());
		System.out.println("Vel Max. c3 " + c3.getVelocidadeMaxima());

	}
	

}
