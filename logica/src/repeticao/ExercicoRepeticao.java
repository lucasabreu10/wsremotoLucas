package repeticao;

import javax.swing.JOptionPane;

public class ExercicoRepeticao {

	public static void main(String[] args) {
		
		int aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da aposta"));
		int resposta = 0;
		int tentativa = 0;
		
		do {	
			resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite a resposta"));
					
					if(resposta!=aposta && resposta<aposta) {
						System.out.println("Errou numero muito baixo!!!");
						tentativa = tentativa + 1 ;
				
					
				}
					else if ((resposta!=aposta && resposta>aposta)) {
					System.out.println("Errou numero muito alto!!!");
					tentativa = tentativa + 1 ;
				}
					
					else 				
						System.out.println("Parab�ns!!! vc tentou:" + tentativa);
						
							
	} 		while (resposta != aposta);

	
}
}
