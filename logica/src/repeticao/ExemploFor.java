package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	// contador e o valor inicial / condi��o / como vai ocorrer o incremento(contagem)
	
	public static void main(String[] args) {
		
		
		short tabuada = Short.parseShort(JOptionPane.showInputDialog("Tabuada"));
		
		for (int contador=1;contador<11;contador+=1) {
			
			System.out.println(tabuada + "x" + contador + " = " + (tabuada*contador));
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
