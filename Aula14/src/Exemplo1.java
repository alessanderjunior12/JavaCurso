import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo1 {
	
	public static void main(String[] args) {

		Date data = new Date();
		System.out.println(data);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(data));
	}

}
