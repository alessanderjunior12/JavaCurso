import java.util.Calendar;
import java.util.Locale;

public class Exemplo10 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime()); // hoje

		for (int i = 1; i <= 10; i++) {
			cal.add(Calendar.MONTH, 1);
			System.out.println(i + "a. parcela com vencto em " + cal.getTime());
		}

	}
}
