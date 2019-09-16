package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		double totalNotas = 0.0;
		double notaValida = 0.0;
		double mediaNotas = 0.0;
		int cont = 0;

		do {
			System.out.print("Digite uma nota v�lida (ou -1 p/ sair): ");
			notaValida = nota.nextDouble();
			
			if(notaValida <= 10 && notaValida >= 0 ) {
				totalNotas += notaValida;
				cont++;
			} else if (notaValida != -1) {
				System.out.println("Nota inv�lida! ");
			}
			
		} while (!(notaValida == -1));

		mediaNotas = totalNotas/cont;	
		
		System.out.printf("M�dia da turma: %s", mediaNotas);
		
		nota.close();
		
	}
}
