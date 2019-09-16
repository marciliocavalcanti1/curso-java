package estruturasDeControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma nota: ");
		double nota = Double.parseDouble(scan.next());

		boolean notaInvalida = nota > 10.0 || nota < 0;
		boolean aprovado = nota >= 7.0;
		boolean reprovado = nota < 5.0;

		if (notaInvalida) {
			System.out.printf("A nota %f é inválida.", nota);
		} else if (aprovado) {
			System.out.println("Aprovado");
		} else if (reprovado) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Recuperacao");
		}

		scan.close();

	}
}
