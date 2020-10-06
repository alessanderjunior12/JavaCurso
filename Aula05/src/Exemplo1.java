
public class Exemplo1 {

	public static void main(String args[]) {

		float nota[] = new float[4]; 
		nota[0] = 10.2f;
		nota[1] = 11.2f;
		nota[2] = 7.2f;
		nota[3] = 6.2f;
		
		/*
		System.out.println(nota[0]);
		System.out.println(nota[1]);
		System.out.println(nota[2]);
		System.out.println(nota[3]);
		*/
		
		System.out.println(nota.length);
		
		for(int x = 0; x < nota.length; x++) {
			System.out.println(nota[x]);
		}
		
		
	}

}
