package classes.desafio;

public class Comida {
	
	String nome;
	double peso;
	
	public Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
}
