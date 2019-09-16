package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos alunos você quer informar? ");
		int qtdAlunos = scan.nextInt();
		System.out.print("Quantas notas você quer informar? ");
		int qtdNotas = scan.nextInt();
		double[][] notas = new double[qtdAlunos][qtdNotas];
		double nota = 0;
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a %dª nota do %dº aluno: ", (j+1), (i+1));
				nota = Double.parseDouble(scan.next());
				notas[i][j] = nota;
				media += notas[i][j];
			}
		}
		
		media /= (qtdAlunos * qtdNotas);
		System.out.println(media);

		for (double[] turma : notas) {
			System.out.println(Arrays.toString(turma));
		}
		
		System.out.println(Arrays.toString(notas[0]));

		scan.close();

	}

}
