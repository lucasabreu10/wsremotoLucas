package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		
		String nome= JOptionPane.showInputDialog("Nome").toUpperCase();
		
		while (nome.length()<3 || nome.length()> 15) {
			
			nome = JOptionPane.showInputDialog("Nomeforadopadrao");
		}
		
		System.out.println("nome �: " + nome);	}
	
	
}


