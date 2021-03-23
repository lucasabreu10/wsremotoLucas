package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		float idade = Float.parseFloat(JOptionPane.showInputDialog("Idade"));
		
		
		if(idade < 16) {
			System.out.println("Não pode votar");
		}
		
		
		if(idade >=18 && idade<70) {
			System.out.println("voto obrigatorio");
		}
		
		
		if(idade <=17 && idade>=16 || idade>=70) {
			System.out.println("Voto opcional");
		}
		
		
	}

}
