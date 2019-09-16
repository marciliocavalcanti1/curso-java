package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas notas você quer informar? ");
		int qtdNotas = scan.nextInt();
		double[] notas = new double[qtdNotas];
		double nota = 0;
		double media = 0;

		for (int i = 1; i <= qtdNotas; i++) {

			System.out.printf("Digite a %dª nota: ", i);
			nota = Double.parseDouble(scan.next());
			notas[i - 1] = nota;

		}

		for (double not : notas) {
			media += not;
		}

		media /= notas.length;

		System.out.println("Média da turma: " + media);

		System.out.println(Arrays.toString(notas));

		scan.close();

	}

}
