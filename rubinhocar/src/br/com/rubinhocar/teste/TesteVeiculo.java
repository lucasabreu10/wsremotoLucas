package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		
		
		//Instanciar objeto
		
		Veiculo carro = new Veiculo();
		carro.preencherMontadora(JOptionPane.showInputDialog("Montadora"));
		carro.preencherModelo("uno");
		carro.preencherValor(15000);
		carro.preencherBasico(false,  (short) 200);
		//System.out.println(carro.retornarTudo());
		System.out.println("Desconto" + carro.retornarDesconto());
		//carro.ligar();
		carro.desligar();
		carro.acelerar((short) 30);
		carro.acelerar((short) 30);
		carro.desacelerar((short) 20);
		System.out.println("Depois de aceletar:" + carro.retornarTudo());

	
		
	}

}
