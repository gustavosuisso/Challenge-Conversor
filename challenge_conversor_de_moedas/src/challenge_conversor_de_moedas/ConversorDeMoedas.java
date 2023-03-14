package challenge_conversor_de_moedas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {

	//private double valor;
	private BigDecimal valor;
	// lista das opções de conversão de moedas para usar no JOptionPane
	private String[] opcoesMoedas ={"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreano",
			"De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Yenes a Reais", "De Won Coreano a Reais"};
	// String que vai receber a opção escolhida da lista acima no JOptionPane 
	private String listaConversao;
	private BigDecimal cotacaoDolar = new BigDecimal("5.22");
	private BigDecimal cotacaoEuro = new BigDecimal("5.56");
	private BigDecimal cotacaoLibra = new BigDecimal("6.28");
	private BigDecimal cotacaoYene = new BigDecimal("0.039");
	private BigDecimal cotacaoWon = new BigDecimal("0.00395");
	// instanciando um objeto de DecimalFormat para arredondar o valor da divisão do double, nos caso queremos 2 casas decimais apenas após o 0
	private DecimalFormat df = new DecimalFormat("0.00");

	
	public ConversorDeMoedas(String valor) {
		
		this.valor = new BigDecimal(valor);
		
	}
	
	public void escolherMoeda() {
		
		// é preciso fazer o cast para string
		listaConversao = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para qual você deseja girar seu dinheiro: ", 
				"Moedas", JOptionPane.QUESTION_MESSAGE, null, opcoesMoedas, opcoesMoedas[0]);
		
		switch(listaConversao) {
		
		case "De Reais a Dólares":
		
			// usando o método divide de BigDecimal para dividir o valor passado, passamos a bigdecimal cotacaoDolar
			valor = valor.divide(cotacaoDolar, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é $ " + df.format(valor));
			
			break;
		
		case "De Reais a Euros":
			
			
			valor = valor.divide(cotacaoEuro, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é € " + df.format(valor));
			
//			this.valorConvertido = this.valor / 5.56;
//			df.setRoundingMode(RoundingMode.HALF_UP);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + df.format(this.valorConvertido));
			
			break;
			
		case "De Reais a Libras":
//			
			valor = valor.divide(cotacaoLibra, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é £ " + df.format(valor));
			
//			this.valorConvertido = this.valor / 6.28;
//			df.setRoundingMode(RoundingMode.HALF_UP);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + df.format(this.valorConvertido));
			
			break;
		
		case "De Reais a Yenes":
			
			valor = valor.divide(cotacaoYene, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é ¥ " + df.format(valor));
//			this.valorConvertido = this.valor / 0.039;
//			BigDecimal b2 = new BigDecimal(valorConvertido).setScale(2, RoundingMode.HALF_EVEN);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + b2.doubleValue());
			
			break;
			
		case "De Reais a Won Coreano":
			
			valor = valor.divide(cotacaoWon, 2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "O valor da conversão é ₩ " + df.format(valor));
			
//			this.valorConvertido = this.valor / 0.0040;
//			df.setRoundingMode(RoundingMode.HALF_UP);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + df.format(this.valorConvertido));
			
			break;
			
		case "De Dólares a Reais":
//			
			valor = cotacaoDolar.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));
			
//			this.valorConvertido = this.valor * 5.22;
//			df.setRoundingMode(RoundingMode.HALF_UP);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + df.format(this.valorConvertido));
//			
			break;
			
		case "De Euros a Reais":
//			
			valor = cotacaoEuro.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));
//			this.valorConvertido = this.valor * 5.56;
//			df.setRoundingMode(RoundingMode.HALF_UP);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + df.format(this.valorConvertido));
//			
			break;
		
		case "De Libras a Reais":
			
			valor = cotacaoLibra.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));
//			this.valorConvertido = this.valor * 6.28;
//			df.setRoundingMode(RoundingMode.HALF_UP);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + df.format(this.valorConvertido));
//			
			break;
			
		case "De Yenes a Reais":
			
			valor = cotacaoYene.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));
//			this.valorConvertido = this.valor * 0.039;
//			BigDecimal b4 = new BigDecimal(valorConvertido).setScale(2, RoundingMode.HALF_EVEN);
//			JOptionPane.showMessageDialog(null, "O valor convertido é: " + b4.doubleValue());
			
			break;
			
		case "De Won Coreano a Reais":
			
			valor = cotacaoWon.multiply(valor);
			JOptionPane.showMessageDialog(null, "O valor da conversão é R$ " + df.format(valor));
			
			break;
			
		default:
			
			System.out.println("A opção inserida não é válida.");
			break;
			
		}
		
	}
	
	
	
}
