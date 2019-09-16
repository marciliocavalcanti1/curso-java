package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento ocorre quando a fila est� cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> obter o pr�ximo elementos da fila (sem remover)
		// Diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce��o
		System.out.println(fila.element());
		
		// Poll e Remove -> obter e remover o pr�ximo elementos da fila
		// Diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.size());
		System.out.println(fila.remove()); // lan�a uma exce��o
		
		for (String string : fila) {
			System.out.println(string);
		}

		// System.out.println(fila.size());
		// fila.clear();
		// System.out.println(fila.isEmpty()); // Teste para quando tentar remover algo e verificar se a fila est� vazia
		// System.out.println(fila.contains("Gui"));
		fila.forEach(lista -> { System.out.println(lista); });
		fila.forEach( System.out::println );
	}
}
