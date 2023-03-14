package challenge_conversor_de_moedas;


public class Componentes {

	
	// método que usará o matches passando um regex que aceitaria somente números
	public boolean somenteNumero(String texto) {
		
		return texto.matches("[^\\\\d]+");
		
	}
	
}
