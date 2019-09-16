package estruturasDeControle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
	/*
	 * 6. Jogo da adivinhacaoo: Tentar adivinhar um numero entre 0 - 100. Armazene
	 * um numero aleatorio em uma variavel. O Jogador tem 10 tentativas para
	 * adivinhar o numero gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o numero inserido e maior ou menor do
	 * que o numero armazenado.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int entradaUser;
		int numSorteado;
		int continuar;
		int contador;

		do {
			System.out.print("Digite um numero de 0 a 100: \n");
			Random numeroAleatorio = new Random();
			numSorteado= numeroAleatorio.nextInt(101);
			contador = 0;
			
			do {
				contador++;
				System.out.printf("Ainda restam %d tentativas: ", contador);
				entradaUser = scan.nextInt();
				
				if (entradaUser > numSorteado) {

					System.out.printf("\nO numero sorteado e menor que %d\n\n", entradaUser);

				} else if (entradaUser < numSorteado) {

					System.out.printf("\nO numero sorteado e maior que %d\n\n", entradaUser);

				} else {

					System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", contador);

				}			
				
			} while (entradaUser != numSorteado);
			
			System.out.printf("Digite 0 pra sair, ou qualquer outro numero pra continuar: ");
			continuar = scan.nextInt();		
			
		} while (continuar != 0);

		scan.close();

	}

}
