package challenge_conversor_de_moedas;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		// colocando um número qualquer em resultado apenas para iniciar antes do while
		int resultado = 5;
		
		while(resultado != JOptionPane.NO_OPTION &&  resultado != JOptionPane.CANCEL_OPTION) {
			
		// inserindo um try catch para tratamento
		try {
		
			Menu menu = new Menu();
			menu.escolherConversao();
				
		} catch(NumberFormatException | NullPointerException e) {
			
			NullPointerException nullException = new NullPointerException();
			NumberFormatException numberFexception = new NumberFormatException();
			if(e.getClass() == nullException.getClass()) {
				
				JOptionPane.showMessageDialog(null, "Você precisa inserir algum valor");
				
			} else if( e.getClass() == numberFexception.getClass()) {
				
				JOptionPane.showMessageDialog(null, "Somente números são permitidos");
				
			}
			
		}
		
		resultado = JOptionPane.showConfirmDialog(null, "Deseja Continuar?"); 
		
	  }
		
		JOptionPane.showMessageDialog(null, "Programa finalizado");
	}
	
}
