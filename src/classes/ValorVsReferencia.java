package classes;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;

		
		d2.dia = 4;
		
		System.out.println(d1);
		System.out.println(d2);
		voltarDataParaValorPadrao(d1);
		System.out.println(d2);

		int c = 5;
		System.out.println(alterarPrimitivo(c));
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	
	static int alterarPrimitivo(int a) {
		return ++a;
	}
	

}
