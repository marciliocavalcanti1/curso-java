package fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		// Trabalho da terca (V ou F)
		// Trabalho na quinta (V ou F)
				
		boolean trabTerca = true;
		boolean trabQuinta = false;
		
		if ( trabTerca == false && trabQuinta == false ) {
			
			System.out.println("N�o tem televis�o e nem sorvete!");
			
		} else if ( trabTerca == true && trabQuinta == true ) {
		
			System.out.println("Comprar televis�o de 50\" e sorvete!");
			
		} else if ( trabTerca == true ^ trabQuinta == true ) {
			
			System.out.println("Comprar televis�o de 32\" e sorvete!");
			
		}

		
	}
}
