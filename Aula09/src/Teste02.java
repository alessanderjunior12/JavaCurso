
public class Teste02 {

	public static void main(String[] args) {
		
		Pai pai = new Pai();
		
		pai.gritar();
		pai.falar();
		pai.andar();
		
		
		Filho f =  new Filho();
		f.gritar();

		
		System.out.println(pai.toString());
	}
	
}
