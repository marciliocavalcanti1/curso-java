package oo.composicao;

public class Motor {

	// posso fazer uma relação bidirecional, porém nesse caso não teria sentido

	// Carro carro;
	
	// Motor() {
	//	carro = new Carro();
	// }
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		
		if (!ligado) {
			return 0;
		} else {
			// método round: se estiver mais perto de um valor, ele arredonda
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
