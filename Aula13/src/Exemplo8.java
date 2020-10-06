import java.util.Date;

public class Exemplo8 {

	public static void main(String[] args) {

		Date dataHoje = new Date();
		System.out.println(dataHoje);
		
		
		System.out.println(dataHoje.getTime());
		
		Date data2 =  new Date(-65498798798461l);
		System.out.println(data2);
		
		System.out.println(dataHoje.after(data2));
		
		
		Date data3 =  new Date(76, 2, 27);
		
		
		System.out.println(data3);
		
		System.out.println(data3.getYear());
		
		System.out.println("Voce nasceu no dia " + data3.getDate() + " do mes " + (data3.getMonth()+1) );

		long tempo = dataHoje.getTime() - data3.getTime();
		System.out.println("vivi " + tempo  + " ms ate hoje");
		System.out.println((((tempo/1000)/60)/60)/24);
		
	}
}
