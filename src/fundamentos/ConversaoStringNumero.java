package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o primeiro numero"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o segundo numero"));
	
		System.out.printf("%.2f",valor1 + valor2);
		
	}

}
