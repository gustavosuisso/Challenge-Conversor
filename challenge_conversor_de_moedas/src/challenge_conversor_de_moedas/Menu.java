package challenge_conversor_de_moedas;

import javax.swing.JOptionPane;

public class Menu {
	 
	private String[] opcoesConversao = {"Conversor de Moedas", "Conversor de Temperatura"};
	private String entradaConversao;
	private String valor;
	private Componentes componentes = new Componentes();
	
	
	public void escolherConversao() {
		
		entradaConversao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu", 
				JOptionPane.QUESTION_MESSAGE, null, opcoesConversao, opcoesConversao[0]);
		
		switch(entradaConversao) {
		
		case "Conversor de Moedas":
			
			valor = JOptionPane.showInputDialog("Insira um valor: ");
			
			// chamando um método que utiliza um regex para não permitir letras
			if(!componentes.somenteNumero(valor)) {
				
				JOptionPane.showMessageDialog(null, "Somente números são permitidos");
				
			} else {
			
			ConversorDeMoedas conversorMoedas = new ConversorDeMoedas(valor);
			conversorMoedas.escolherMoeda();
			
			}
			
			break;
			
		case "Conversor de Temperatura":
			
			valor = JOptionPane.showInputDialog("Insira um valor: ");
			
			// chamando um método que utiliza um regex para não permitir letras
			if(!componentes.somenteNumero(valor)) {
				
				JOptionPane.showMessageDialog(null, "Somente números são permitidos");
				
			} else {
			
			ConversorDeTemperatura conversorTemperatura = new ConversorDeTemperatura(valor);
			conversorTemperatura.converteTemperatura();
			
			}
			
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Valor inválido.");
			break;
		
		}
	}
	
	public String getValor() {
		
		valor = JOptionPane.showInputDialog("Insira um valor: ");
		
		if(!componentes.somenteNumero(valor)) {
			
			JOptionPane.showMessageDialog(null, "Somente números são permitidos");
			
		} 		
		
		return valor;
		
	}
	
}
