package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

		// Literal será primitivo
		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;// Integer.parseInt(entrada.next());
		// Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);

		Float f = 123F;
		System.out.println(f);

		Double d = 1234.5;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		System.out.println(("" + bo).toUpperCase());

		Character c = '#';
		System.out.println(c + "...");

		entrada.close();

	}
}
