package estruturasDeControle;

public class DesafioFor {

	public static void main(String[] args) {

		// var valor = "#";
		//
		// for (int i = 0; i <= 5; i++) {
		// System.out.println(valor);
		// valor += "#";
		// }

		for (String valor = "#"; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}
	}
}
