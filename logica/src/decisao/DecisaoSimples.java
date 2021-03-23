package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Digite a disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 01"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 02"));
		float media = (nota1 + nota2)/2;
		System.out.println("Média:" + media);

		if (media >= 6) {

			System.out.println("Parabéns!!! \nVocê esta aprovado");

		}

		if (media <4) {
			System.out.println("PERDEU");
		}

		if (media <6 && media >=4) {
			System.out.println("Você esta de exame");
		}
	}





}
