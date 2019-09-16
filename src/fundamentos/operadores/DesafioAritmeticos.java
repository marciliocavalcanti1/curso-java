package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
	
		int numeradorUm = (int) Math.pow((6 * (3 + 2)), 2);
		int denominadorUm = 3 * 2;
		int fracaoUm = numeradorUm / denominadorUm;
		
		int numeradorDois = (1-5) * (2-7); 
		int denominadorDois = 2;
		int fracaoDois = (int) Math.pow((numeradorDois / denominadorDois), 2);
		
		int numerador = (int) Math.pow((fracaoUm - fracaoDois), 3);
		int denominador = (int) Math.pow(10, 3);
		int fracao = numerador / denominador;
		
		System.out.println(fracao);
				
	}

}
