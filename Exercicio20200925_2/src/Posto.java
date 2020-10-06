
public class Posto {
	
	public void abastecer(Veiculo v) {
		
		v.buzinar();
		
		if (v instanceof IDiesel) {
			System.out.println("abastecendo Diesel...");
		}
		
		if (v instanceof IEtanol) {
			System.out.println("abastecendo IEtanol...");
		}
		
		if (v instanceof IGasolina) {
			System.out.println("abastecendo IGasolina...");
		}
		
		if (v instanceof IGNV) {
			System.out.println("abastecendo IGNV...");
		}
		
	}

}
