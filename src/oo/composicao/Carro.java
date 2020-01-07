package oo.composicao;

public class Carro {

	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	/**
	 * Método que verifica se o motor do carro está ligado ou desligado.
	 * @return atributo 'ligado' da classe 'motor'
	 */
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
