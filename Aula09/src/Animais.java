
public enum Animais {

	PASSARO("piu piu"),
	CAO("au au"),
	GATO("miau");
	
	private String som;
	
	public String getSom() {
		return som;
	}
	
	private Animais(String som) {
		this.som = som;
	}
	

}
