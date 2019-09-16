package estruturasDeControle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String conceito = "";
		int nota = scan.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		}
		
		System.out.println(conceito);
		scan.close();
	}

}
