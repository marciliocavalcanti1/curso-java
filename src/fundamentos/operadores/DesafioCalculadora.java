package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - / * %
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double firstNumb = Double.parseDouble(scan.next());
		System.out.print("Segundo número: ");
		double secNumb = Double.parseDouble(scan.next());
		System.out.print("Operação: ");
		String operacao = scan.next();

		
		double resultado = operacao.contains("%") ? firstNumb % secNumb: 0;
		resultado = operacao.contains("*") ? firstNumb * secNumb : resultado;
		resultado = operacao.contains("/") ? firstNumb / secNumb : resultado;
		resultado = operacao.contains("-") ? firstNumb - secNumb : resultado;
		resultado = operacao.contains("+") ? firstNumb + secNumb : resultado;
		
		System.out.printf("Resultado da operação de \"%.1f %s %.1f\" é igual: %s", firstNumb, operacao, secNumb, resultado);
		
		scan.close();

	}

}
