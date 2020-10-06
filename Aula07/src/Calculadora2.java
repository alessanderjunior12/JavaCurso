
public class Calculadora2 {
	
	private String nomeCalculadora;
	
	public Calculadora2() {
		System.out.println("estou no construtor");
		nomeCalculadora = "lotus123";
	}
	
	public Calculadora2(String nome) {
		System.out.println("estou no construtor");
		nomeCalculadora = nome;
	}

	public String getNomeCalculadora() {
		return nomeCalculadora;
	}
	
	public int soma(byte b1, byte b2) {
		System.out.println("tipo byte");
		return b1+b2;
	}
	
	public long soma(long b1, long b2) {
		System.out.println("tipo long");
		return b1+b2;
	}
	
	public double soma(double b1, double b2) {
		System.out.println("tipo double");
		return b1+b2;
	}
	
	public float soma(float b1, float b2) {
		System.out.println("tipo float");
		return b1+b2;
	}
	
	
	public int soma(int... b) {
		System.out.println("tipo int...");

		System.out.println("quantos inteiros chegaram ? " + b.length);
		
		int resultado =0;
		for (int i = 0; i < b.length; i++) { //navegar por cada elemento do vetor "b"
			resultado = resultado + b[i];
		}
		return resultado;
		
	}

	public int soma(long x, int... b) {
		System.out.println("tipo long, int...");

		System.out.println("quantos inteiros chegaram ? " + b.length);
		
		int resultado =0;
		for (int i = 0; i < b.length; i++) { //navegar por cada elemento do vetor "b"
			resultado = resultado + b[i];
		}
		return resultado;
		
	}

	

}
