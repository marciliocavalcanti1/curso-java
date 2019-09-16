package classes;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double desc) {
		return preco * (1 - desconto + desc);
	}
	
	
}
