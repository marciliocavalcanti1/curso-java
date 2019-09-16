package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Hello".charAt(2));
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String usuario = "Fulano";
		
		boolean userExist = usuario.contains("Fulano");
		
		if(userExist) {
			System.out.println(true);
		}
				
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		double salario = 12345.6788;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}

}
