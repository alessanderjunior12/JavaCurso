
public class Individuo extends Pessoa implements IAtleta, IAnalistaSistemas {

	public Individuo(String nome, String cpf, String email) {
		super(nome, cpf,email);
	}
	
	@Override
	public void saudar() {
		System.out.println("ola");
		
	}
	
	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("correndo...");
	}

	@Override
	public void repousar() {
		// TODO Auto-generated method stub
		System.out.println("repousando...");
	}

	@Override
	public void desenvolver() {
		System.out.println("desenvolvendo...");
		
	}

	@Override
	public void analisar() {
		System.out.println("analisando...");
		
	}

	
	
}
