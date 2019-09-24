package outros;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		double depositInitial;
		Conta conta;
	
		System.out.print("Entre o n�mero da conta: ");
		int numberAccount = scan.nextInt();
		System.out.printf("Entre o titular da conta: ");
		String nameHolder = scan.next();
		System.out.printf("Haver� dep�sito inicial (s/n)? ");
		char choiceDepositInitial = scan.next().charAt(0);
		// (char)System.in.read();

		if (choiceDepositInitial == 's' || choiceDepositInitial == 'S') {
			System.out.printf("Entre o valor de dep�sito inicial: $ ");
			depositInitial = Double.parseDouble(scan.next().replace(",", "."));

			conta = new Conta(numberAccount, nameHolder, depositInitial);
		} else {
			conta = new Conta(numberAccount, nameHolder, choiceDepositInitial);
		}

		System.out.printf("\nDados da conta: \n" + conta);

		System.out.printf("\nEntre um valor para dep�sito: $ ");
		double value = Double.parseDouble(scan.next().replace(",", "."));
		conta.DepositAccount(value);
		System.out.printf("Dados da conta atualizados: \n" + conta);

		System.out.printf("\nEntre um valor para saque: $ ");
		value = Double.parseDouble(scan.next().replace(",", "."));
		conta.DraftAccount(value);
		System.out.printf("Dados da conta atualizados: \n" + conta);
		
		scan.close();
	}
}
