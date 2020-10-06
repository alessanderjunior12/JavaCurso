
public class Produto {

	private String identificacao;
	private double preco;
	private String fabricante;

	public void setPreco(double precoDeFora) {
		preco = precoDeFora;
	}

	public double getPreco() {
		return preco;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setIdentificacao(String identificacoDeFora) {

		// se identi... nao for nula, entre.
		// se ident... for maior que 15 caracteres, reclame!

		identificacao = identificacoDeFora;

	}

	public String getIdentificacao() {

		// se identi... nao for nula, entre.
		// se ident... for maior que 15 caracteres, reclame!
		return identificacao;

	}

	public void imprimir() {
		System.out.println("----------------------------------");
		System.out.println("Id: " + identificacao);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Preco: " + preco);

	}

	public void aumentarPreco(float percentual) {
		preco *= percentual;
	}

	public void reduzirPreco() {
		preco *= 0.9;
	}

}
