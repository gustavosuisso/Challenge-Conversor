package challenge_conversor_de_moedas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorDeTemperatura {

	private String[] opcoesEscalas = {"De Celsius para Fahrenheit", "De Celsius para Kelvin", "De Fahrenheit para Celsius", 
			"De Fahrenheit para Kelvin", "De Kelvin para Celsius", "De Kelvin para Fahrenheit"};
	private String listaDeEscalas;
	private double valorTemperatura; 
	private DecimalFormat df = new DecimalFormat("0.00");
	
	
	public ConversorDeTemperatura(String valor) {
		
		this.valorTemperatura = Double.parseDouble(valor);
		
	}
	
	public void converteTemperatura() {
		
		listaDeEscalas = (String) JOptionPane.showInputDialog(null, "Escolha a escala que você quer converter: ", "Escalas termométricas: ", 
				JOptionPane.QUESTION_MESSAGE, null, opcoesEscalas, opcoesEscalas[0]);
		
		switch(listaDeEscalas) {
		
		case "De Celsius para Fahrenheit":
			
			valorTemperatura = (valorTemperatura * 1.8) + 32;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "O valor convertido é igual a " +  df.format(valorTemperatura) + " Fahrenheit.");
			
			break;
			
		case "De Celsius para Kelvin":
			
			valorTemperatura = valorTemperatura + 273.15;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "O valor convertido é igual a " + df.format(valorTemperatura) + " Kelvin.");
			
			break;
			
		case "De Fahrenheit para Celsius":
			
			// também poderia ser (valorTemperatura - 32) / 1.8
			valorTemperatura = (valorTemperatura - 32) * 5 / 9;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "O valor convertido é igual a " + df.format(valorTemperatura) + " graus Celsius.");
			
			break;
			
		case "De Fahrenheit para Kelvin":
			
			valorTemperatura = ((valorTemperatura - 32) / 1.8) + 273.15;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "O valor convertido é igual a " + df.format(valorTemperatura) + " Kelvin.");
			
			break;
			
		case "De Kelvin para Celsius":
			
			valorTemperatura = valorTemperatura - 273.15;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "O valor convertido é igual a " + df.format(valorTemperatura) + " graus Celsius.");
			
			break;
			
		case "De Kelvin para Fahrenheit":
			
			valorTemperatura = 1.8 * (valorTemperatura - 273.15) + 32;
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "O valor convertido é igual a " + df.format(valorTemperatura) + " Fahrenheit.");
			
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Valor inválido.");
		
		}	
	}
	
}
