
public class Exemplo2 {

	
	public static void main(String[] args) {
		
		
		Double double1 = new Double(25.6);
		Double double2 = new Double("25.6");
		Double double3 = 25.6;
		
		System.out.println(double1 + 33.7);
		
		if(double1 == 25.6){
			System.out.println("sao iguais");
		}
		
		double d4 = Double.parseDouble("55.6");
		System.out.println(d4-10);
		
		Double d5 = Double.valueOf(89);
		System.out.println(d5);
		
		
		
		
	}
}
