package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {

		int numero1=0;
		int numero2=0;
		String operacao =""; 
		String resp ="";
		
		
		do {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Numero1"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero2"));
			operacao = JOptionPane.showInputDialog("Digite o operador");
			
			if (operacao.equals("+") == true) {
				System.out.println("Resultado:" + (numero1+numero2));
			}
			
			else if (operacao.equals("-")) {
				System.out.println("Resultado:" + (numero1-numero2));
			}
			
			else if (operacao.equals("*")) {
				System.out.println("Resultado:" + (numero1*numero2));
			}
			
			else if (operacao.equals("/")) {
				System.out.println("Resultado:" + (numero1/numero2));
			}

		resp = JOptionPane.showInputDialog("Digite s para continuar").toUpperCase();
		}
		while (resp.equals("S"));
		
		}
	}
	
