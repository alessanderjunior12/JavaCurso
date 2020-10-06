import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exemplo2 {
	
	public static void main(String[] args) {

		Date data = new Date();
		System.out.println(data);
		
		Locale pt_br = new Locale("pt","br");
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd",pt_br);
		System.out.println(sdf.format(data));
		
		
	}

}
