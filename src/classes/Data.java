package classes;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}
	
	public Data(int dia, int mes, int ano) {
		this(dia, mes);
		this.ano = ano;
	}
	

	@Override
	public String toString() {
		String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}

}
