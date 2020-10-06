import java.text.NumberFormat;
import java.util.Locale;

public class Exemplo4 {

	public static void main(String[] args) {

		double salario = 356625.236546321346134165;
		System.out.println(salario);

		NumberFormat nf = NumberFormat.getCurrencyInstance(); // sem inf. pega do S.O.
		System.out.println(nf.format(salario));

		nf = NumberFormat.getCurrencyInstance(Locale.CANADA); // sem inf. pega do S.O.
		System.out.println(nf.format(salario));

		nf = NumberFormat.getCurrencyInstance(Locale.JAPAN); // sem inf. pega do S.O.
		System.out.println(nf.format(salario));

		nf = NumberFormat.getCurrencyInstance(Locale.FRENCH); // sem inf. pega do S.O.
		System.out.println(nf.format(salario));

		nf = NumberFormat.getNumberInstance(); // sem inf. pega do S.O.
		nf.setMinimumFractionDigits(4);
		nf.setMaximumFractionDigits(8);
		System.out.println(nf.format(salario));

		nf = NumberFormat.getPercentInstance(); // sem inf. pega do S.O.
		System.out.println(nf.format(salario));

		for (Locale l : NumberFormat.getAvailableLocales()) {

			if (l.getDisplayCountry().startsWith("Bra")) {
				System.out.println(l.getDisplayName());
			}

		}

	}

}
