package classes.desafio;

public class Pessoa {
	
	private String nome;
	private double peso;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public double comer(Comida pesoComida) {
		return peso += pesoComida.peso;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome
				+ String.format("\nPeso: %.2fkg", peso);
	}

}
