package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Digite a disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 01"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 02"));
		float media = (nota1 + nota2)/2;
		System.out.println("M�dia:" + media);

		if (media >= 6) {

			System.out.println("Parab�ns!!! \nVoc� esta aprovado");

		}else if (media <4) {
			System.out.println("PERDEU");
				
		}else {
			System.out.println("Voc� esta de exame");
		}
	
	
	
	
	
	}

}
