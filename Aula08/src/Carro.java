
public class Carro {

	private String nome;
	private String cor;
	private String placa;
	private static int velocidadeMaxima = 60;
	public static final int VELOCIDADE_MAXIMA = 30;//constante
	
	static {
		/*
		 * este bloco é executado uma unica vez na JVM e nunca mais!!
		 */
		System.out.println("estou no bloco static !");
		
	}

	
	{
		
		/*
		 * Este bloco é executado sempre que uma instancia nova 
		 * é criada. Independente de qual construtor foi chamado
		 */
		System.out.println("Bloco de inicializacao padrao");
		
	}
	

	
	public Carro(String nome, String cor, String placa) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public static int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public static void setVelocidadeMaxima(int velocidadeMaxima) {
		Carro.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", cor=" + cor + ", placa=" + placa + "]";
	}
	
	
	public static void buzinar() {
		System.out.println("fom fom");
	}
	
	
	
}
