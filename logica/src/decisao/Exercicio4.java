package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {


		int numero01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o nuemro01 "));
		int numero02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o nuemro02 "));
		int numero03 = Integer.parseInt(JOptionPane.showInputDialog("Digite o nuemro03 "));

		if(numero01 == numero02 || numero02 == numero03 || numero01 == numero03) {
			System.out.println("Existem numero iguais");
		}
		
		else if ((numero01 > numero02 ) && (numero01 >numero03) && (numero02 > numero03)) {
			System.out.println("Numero01: " + numero01);
			System.out.println("Numero02: " + numero02);
			System.out.println("Numero03: " + numero03);
		}
		
		
		if ((numero01 > numero03 ) && (numero01 >numero02) && (numero03 > numero02)) {
			System.out.println("Numero01: " + numero01);
			System.out.println("Numero03: " + numero03);
			System.out.println("Numero02: " + numero02);
		}
		
		if ((numero02 > numero01 ) && (numero02 >numero03) && (numero01 > numero03)) {
			System.out.println("Numero02: " + numero02);
			System.out.println("Numero01: " + numero01);
			System.out.println("Numero03: " + numero03);
		}
		if ((numero02 > numero01 ) && (numero02 >numero03) && (numero03 > numero01)) {
			System.out.println("Numero02: " + numero02);
			System.out.println("Numero03: " + numero03);
			System.out.println("Numero01: " + numero01);
		}	
		if ((numero03 > numero01 ) && (numero03 >numero02) && (numero01 > numero02)) {
			System.out.println("Numero02: " + numero03);
			System.out.println("Numero03: " + numero01);
			System.out.println("Numero01: " + numero02);
		}
		
		if ((numero03 > numero01 ) && (numero03 >numero02) && (numero02 > numero01)) {
			System.out.println("Numero02: " + numero03);
			System.out.println("Numero03: " + numero02);
			System.out.println("Numero01: " + numero01);
		}
				
			
			}
		}



	



