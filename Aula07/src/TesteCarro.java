
public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro c1 = new Carro("chassi 12345");

		c1.setCor("preto");
		c1.setNumeroPortas(4);
		c1.setPlaca("LSO1176");
		
		System.out.println(c1);
		
		Carro c2 = new Carro("chassi1", "branca", "KPV4711", 2);
		c2.setCor("fucsia");
		System.out.println(c2);
		
	}

}
