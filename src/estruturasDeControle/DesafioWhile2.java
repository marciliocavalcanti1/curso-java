package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile2 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra = "sair";
		
		do {
			System.out.print("Voc� diz: ");
			palavra = "sair";
		} while (!palavra.equalsIgnoreCase("sair"));

		scan.close();
		
		
	}

}
