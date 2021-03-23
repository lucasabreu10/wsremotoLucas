package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao {

	public static void main(String[] args) {
		
		float dias = Float.parseFloat(JOptionPane.showInputDialog("Digite o nuemro de diarias"));	
		short vldiaria = 80;
		
		
		if(dias > 15 ) {
			double valortotal = (vldiaria + 5.5) * dias;
			System.out.println("A sua conta ficou no valor de: " + valortotal);
			
		} else if(dias == 15 ) {
			float valortotal = (vldiaria * 6)* dias;
			System.out.println("A sua conta ficou no valor de: " + valortotal);
		}
		
		else {
			float valortotal = (vldiaria + 8)* dias;
			System.out.println("A sua conta ficou no valor de: " + valortotal);
		}
		
		
			
	}
		
		
	}
	
	
	

