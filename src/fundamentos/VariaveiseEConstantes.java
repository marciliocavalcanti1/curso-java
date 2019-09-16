package fundamentos;

public class VariaveiseEConstantes {

		public static void main(String[] args) {
			double raio = 4.5;
			// constante
			final double PI = 3.1416;
			double area = PI * raio * raio;
			
			System.out.println("área é " + area + " m2.");
			// printf -> imprime de forma formatada
			// %f -> é substituido pela variavel que foi passada como parametro, em ponto flutuante
			System.out.printf("Área é %f m2. \n" , area);
			// %.2f -> imprime somente com 2 casas decimais, nesse caso
			System.out.printf("Área é %.2f m2." , area);
		}
}
