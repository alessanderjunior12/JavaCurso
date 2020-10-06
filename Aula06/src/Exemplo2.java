
public class Exemplo2 {

	public static void main(String[] args) {
		
		Produto produto1= new Produto();
		Produto produto2= new Produto();
		Produto produto3= new Produto();
		
		produto1.setIdentificacao("Camiseta");
		produto1.setPreco(45d);
		produto1.setFabricante( "Hering");
		
		produto2.setIdentificacao("Bermuda");
		produto2.setPreco( 55d);
		produto2.setFabricante( "CA");

		produto3.setIdentificacao( "chinelo");
		produto3.setPreco( 15d);
		produto3.setFabricante( "Tommy");


		System.out.println(produto3.getIdentificacao());
		System.out.println(produto2.getIdentificacao());
		System.out.println(produto1.getIdentificacao());
		
		double total = produto1.getPreco() + produto2.getPreco() + produto3.getPreco();
		
		System.out.println("Custo total = " + total);
		
		/*
		System.out.println(produto1.identificacao);
		System.out.println(produto1.fabricante);
		System.out.println(produto1.preco);
		*/

		produto1.imprimir();
		produto2.imprimir();
		produto3.imprimir();
		
		produto1.aumentarPreco(1.3f);
		
		produto1.imprimir();
		produto2.imprimir();
		produto3.imprimir();
		
		
	}
	
}
