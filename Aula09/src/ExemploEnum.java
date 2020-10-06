
public class ExemploEnum {

	public static void main(String[] args) {

		System.out.println(EstadoCivil.CASADO);
		
		if(EstadoCivil.CASADO == EstadoCivil.CASADO) {
			System.out.println("é casado mesmo");
		}

		EstadoCivil e = EstadoCivil.DIVORCIADO;
		
		if(e == EstadoCivil.DIVORCIADO) {
			System.out.println("nao é casado");
		}


		EstadoCivil[] vetorEstadoCivil = EstadoCivil.values();
		for (int i = 0; i < vetorEstadoCivil.length; i++) {
			EstadoCivil estadoCivil = vetorEstadoCivil[i];
			System.out.println(estadoCivil);
		}
		

		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil);
		}
		
		
	}
}
