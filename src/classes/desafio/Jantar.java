package classes.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("João", 80);
		
		Comida c1 = new Comida("Feijão", 0.230);
		Comida c2 = new Comida("Arroz", 0.150);
		
		System.out.println("Antes: \n" + p);
				
		p.comer(c1);
		p.comer(c2);
		
		System.out.println("\nDepois: \n" + p);
		
	}

}
