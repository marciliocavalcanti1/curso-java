package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Temperatura {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//System.out.print("Digite a temperatura em Fahrenheit: ");
		// double fahrenheit = scan.nextDouble();
		String fahrenheit = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: ");

		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9;

		double conversao = (Double.parseDouble(fahrenheit) - AJUSTE) * FATOR;
		double celsius = conversao;

		if (celsius == 0) {
			
			double intCelsius = (int) celsius;
			
			JOptionPane.showMessageDialog(null, "Temperatura: " + intCelsius + "°C" );
			// System.out.printf("Temperatura: %d °C", intCelsius);

		} else {
			
			JOptionPane.showMessageDialog(null, "Temperatura: " + celsius + "°C" );
			//System.out.printf("Temperatura: %.1f °C", celsius);

		}

		scan.close();

	}
}
