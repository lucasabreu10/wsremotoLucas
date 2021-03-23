package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.lojaxpto.Cliente;
import br.com.gama.lojaxpto.PessoaFisica;
import br.com.gama.lojaxpto.PessoaJuridica;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		
		if(JOptionPane.showInputDialog("Digite F > Fisica e qlqr coisa para juridica").toUpperCase().equals("F")) {
			
			cliente = new PessoaFisica(
					"nomePF",
					"email@pf.com",
					"12345678900",
					"1149446-x"	);
			
		} else {
			
			cliente = new PessoaJuridica(
					"nomepf",
					"email@pj.com.br",
					"112334444444/55",
					"contato",
					"123.123.123"
					);
		
		}
		
		
		System.out.println(cliente.toString());
		System.out.println(cliente.getDocumentos());
		
			
		
		
		
		
		


	}




}
