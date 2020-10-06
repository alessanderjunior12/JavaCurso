
public class Exemplo04 {

	public static void main(String[] args) {
		
		byte a = 127;
		short b = 128;
		int c = 32000;
		long d = 65000000;

		a = (byte)b; //casting explicito (maior para o menor)
		System.out.println(a);
		
		/*
			b = a; //casting implicito (menor para o maior)
			c = b;
			d = c;
		*/
		
		
		
	}
}
