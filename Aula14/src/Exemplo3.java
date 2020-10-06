import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exemplo3 {
	
	public static void main(String[] args) {

		Date data = new Date();
		System.out.println(data);
		
		Locale ptBr =  new Locale("pt","br");
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, ptBr);//01/10/2020
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, ptBr);//1 de out. de 2020
		System.out.println(df.format(data));

		df = DateFormat.getDateInstance(DateFormat.LONG, ptBr);//1 de outubro de 2020
		System.out.println(df.format(data));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, ptBr);//quinta-feira, 1 de outubro de 2020
		System.out.println(df.format(data));
	}

}
