package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("Digite o time 1");		
		String time2 = JOptionPane.showInputDialog("Digite o time 2");

		
		double entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do ingresso"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o publico"));
		
		
		
		double total = entrada * publico;
		
		
		
		System.out.printf(" No Jogo entre %s x %s a arrecadacao foi de R$ %.2f", time1, time2, total);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
