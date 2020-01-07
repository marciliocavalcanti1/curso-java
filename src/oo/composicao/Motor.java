package oo.composicao;

public class Motor {

	// posso fazer uma rela��o bidirecional, por�m nesse caso n�o teria sentido

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
			// m�todo round: se estiver mais perto de um valor, ele arredonda
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
