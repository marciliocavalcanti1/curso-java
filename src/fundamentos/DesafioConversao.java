package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario1 = Double.parseDouble(scan.nextLine().replace(",", "."));
		double salario2 = Double.parseDouble(scan.nextLine().replace(",", "."));
		double salario3 = Double.parseDouble(scan.nextLine().replace(",", "."));

		double media = (salario1 + salario2 + salario3) / 3;

		System.out.println(media);

		scan.close();

	}
}
