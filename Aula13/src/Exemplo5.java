
public class Exemplo5 {

	public static void main(String[] args) {

		String nome1 = "erico"; //end memoria: f1a
		String nome2 = "erico"; //end memoria: f1a

		if(nome1 == nome2) { //f1a == f1a ? Sim 
			System.out.println("sao iguais");
		} else {
			System.out.println("sao diferentes");
		}
		
		String nome3 = new String("erico"); //end memoria: b2c
		String nome4 = new String("erico"); //end memoria: c3c

		if(nome3 == nome4) { // b2c == c3c ? Não
			System.out.println("sao iguais");
		} else {
			System.out.println("sao diferentes"); //entra aqui
		}

		if(nome3.equals(nome4)) { //erico == erico 
			System.out.println("sao iguais"); //Sim
		} else {
			System.out.println("sao diferentes");
		}

		System.out.println(nome1.concat("torres"));
		System.out.println(nome1);
		System.out.println(nome1.toLowerCase());
		System.out.println(nome1.toUpperCase());
		System.out.println(nome1.charAt(1));
		System.out.println(nome1.length());
		System.out.println(nome1.substring(3));		
		System.out.println(nome1.substring(2,5));
		System.out.println(nome1.indexOf("i"));
		
		
		
		
		
	}
}
