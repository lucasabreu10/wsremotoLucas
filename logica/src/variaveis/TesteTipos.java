package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		
		double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto"));
		double valorunit = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unit�rio"));	
		double valorcomimposto = valorunit * quantidade + imposto;
		
		
		
		System.out.println("Valor com imposto:" + valorcomimposto);
		System.out.println("Valor de imposto:" + imposto);
		System.out.println("Valor sem imposto:" + valorunit * quantidade);
		
		
		
		//System.out.printf(" No Jogo entre %s x %s a arrecadacao foi de R$ %.2f", time1, time2, total);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
