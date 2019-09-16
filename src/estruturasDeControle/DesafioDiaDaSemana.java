package estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite: ");
		String diaSemana = scan.next();

		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if ("terca".equalsIgnoreCase(diaSemana)
				|| "terça".equalsIgnoreCase(diaSemana)) {
			System.out.println("3");
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (diaSemana.equalsIgnoreCase(
				"sabado")
				|| "sábado".equalsIgnoreCase(diaSemana)) {
			System.out.println("7");
		} else {
			System.out.println("Digite um dia correto");
		}

		scan.close();
	}

}
