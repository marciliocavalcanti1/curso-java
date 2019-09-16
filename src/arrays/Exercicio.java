package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		// Pegar o último elemento do array
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);

		System.out.println("\nForeach:");
		double total = 0;
		for (double notas : notasAlunoA) {
			System.out.println(notas);
			total += notas;
		}
		System.out.printf("Média: %.2f\n", total / notasAlunoA.length);

		System.out.println("\nFor:");
		total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
			total += notasAlunoA[i];
		}
		System.out.printf("Média: %.2f\n", total / notasAlunoA.length);

		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		for (double notas : notasAlunoB) {
			System.out.print(notas + " ");
		}
		
	}
}
