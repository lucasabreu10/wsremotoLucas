package repeticao;

import javax.swing.JOptionPane;

public class Exercico2 {

	public static void main(String[] args) {


		String nome = "";
		int idade = 0;
		String cadastro = "";
		int contador = 0;
		int maiores =0;
		int idadetotal = 0;
		String maisnovonome =""; 
		int maisnovoidade = 999;
		
		String maisvelhonome =""; 
		int maisvelhoidade = 0;

		do {
			contador = contador +1;
			
			nome = JOptionPane.showInputDialog("Digite o nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
			
			idadetotal = idade + idade;
			
			if(idade < maisnovoidade) {
				maisnovonome = nome;
				maisnovoidade = idade;
			}		
			

			if(idade > 18) {
				maiores = maiores +1;
			}

			cadastro = JOptionPane.showInputDialog("digite sair");


		} while (cadastro.equals("sair") == false);
				

		System.out.println("numero de pessoas maiores: " + maiores);
		System.out.println("m?dia da idade: " + idadetotal/contador);
		System.out.println("Mais Novo nome: " + maisnovonome);
		System.out.println("Mais Novo idade: " + maisnovoidade);








	}



}
