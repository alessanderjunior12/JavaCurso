import java.util.Calendar;
import java.util.Locale;

public class Exemplo9 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		cal.add(Calendar.MONTH, 2);
		
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, 30);
		
		System.out.println(cal.getTime());
		
		
		//cal.add(Calendar.DAY_OF_MONTH, -300);
		
		System.out.println(cal.getTime());

		Locale pt_br =  new Locale("pt", "br");
		System.out.println(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, pt_br));
		
		
		
	}
}
