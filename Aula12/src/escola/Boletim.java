package escola;

public class Boletim {

	private String nome;
	private double nota[] = new double[4];

	public String obterSituacao() throws RecuperacaoException,ReprovadoException{

		//inicializando media
		double media = 0;
		
		//percorredno o vetor para somar as notas
		for (int i = 0; i < nota.length; i++) {
			media += nota[i];
		}
		
		//calculando a media
		media = media / nota.length;

		// verificando as notas
		if (media < 7 && media > 5) {
			
			RecuperacaoException rec =  new RecuperacaoException("em recuperação");
			throw rec;
			// recuperacao
		} else 
			if (media <= 5) {
				ReprovadoException rec =  new ReprovadoException("reprovado!!!!!");
				throw rec;
			// reprovado
		}

		return "aprovado";

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

}
