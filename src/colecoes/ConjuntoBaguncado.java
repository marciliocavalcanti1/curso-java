package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(false);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.printf("Tamanho é %s",conjunto.size());
				
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.printf("\nTamanho é %s%n",conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));

		System.out.printf("Tamanho é %s%n",conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // união entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		System.out.println(conjunto.size());
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
