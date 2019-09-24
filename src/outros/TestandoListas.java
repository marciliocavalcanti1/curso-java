package outros;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Um";
		String aula2 = "Dois";
		String aula3 = "Três";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// 1. Método Foreach
		aulas.forEach(aula -> {
			System.out.printf("Aula: %s\n", aula);
		});
		
		// 2. Método foreach
		// aulas.forEach(System.out::println);

		aulas.remove(aula2);
		System.out.println(aulas);

		String primeiraAula = aulas.get(0);
		System.out.printf("A primeira aula é: %s%n", primeiraAula);

		/*
		 * Nesse caso, como se trata de uma lista, o método para retorna o tamanho é o
		 * "size()" e não o atributo lenght
		 */
		// Não é uma boa prática, utilizar o for para varrer a lista
		for (int i = 0; i < aulas.size(); i++) {

			String listaAulas = aulas.get(i);
			System.out.println(listaAulas);

		}

		System.out.println(aulas.size());

		aulas.add("Aula Quatro");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);

		// 3. Foreach convencional
		// for (String aula : aulas) { System.out.println(aula); }

	}
}
