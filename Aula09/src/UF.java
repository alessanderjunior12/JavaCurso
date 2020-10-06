
public enum UF {
	
	SP("São Paulo",5000), RJ("Rio de Janeiro",15000), SC("Santa Catarina",2000), ES("Espirito Santo",1500);
	
	private String extenso;
	private int populacao;
	
	public String getExtenso() {
		return extenso;
	}
	
	public int getPopulacao() {
		return populacao;
	}
	
	private UF(String descricao, int populacao) {
		this.extenso = descricao;
		this.populacao = populacao;
	}

}
