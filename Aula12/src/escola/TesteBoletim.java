package escola;

public class TesteBoletim {

	public static void main(String[] args) {

		Boletim b = new Boletim();
		b.setNome("Alessander");
		double notas[] = { 15, 15, 10, 15 };
		b.setNota(notas);

		try {
			System.out.print("O aluno " + b.getNome() + " foi ");
			System.out.println(b.obterSituacao());

		} catch (RecuperacaoException e) {
			
			System.out.println(e.getMessage());
		
		} catch (ReprovadoException e) {
		
			System.out.println(e.getMessage());
		
		} finally {

			System.out.println("bloco que sempre sera executado");
			
		}
		

	}

}
