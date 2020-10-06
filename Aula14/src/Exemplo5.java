import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {

		//pergunte ao usuario o valor do produto e em quantas vezes ele deseja parcelar.
		//imprimir o valor total, e as parcelas com o seu respctivo valor e data de vcto.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com o valor do produto:");
		double valor = teclado.nextDouble();
		
		System.out.print("Entre com a qtde de parcelas:");
		int qtdParcelas = teclado.nextInt();
		
		double valorDeCadaParcela = valor / qtdParcelas;
		
		Calendar cal = Calendar.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		
		//se a data de vencimento for um final de semana, colocar o vencimento para o proximo dia util
		for (int i = 1; i <= qtdParcelas; i++) {

			cal.add(Calendar.DAY_OF_MONTH, 30);
			
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				cal.add(Calendar.DAY_OF_MONTH, 1);
			} else
				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					cal.add(Calendar.DAY_OF_MONTH, 2);
				}	
			String dataFormatada = df.format(cal.getTime());
			String prestacaoFormatada = nf.format(valorDeCadaParcela);
			
			System.out.println(i + "a. parcela com vencto em " + dataFormatada + " no valor de " + prestacaoFormatada);
			
		}

	}
}
