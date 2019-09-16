package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Teste");
		lista.add("Teste01");
		lista.add("Teste02");
		
		for (String teste : lista) {
			System.out.println(teste);			
		}
		
		Set<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
 