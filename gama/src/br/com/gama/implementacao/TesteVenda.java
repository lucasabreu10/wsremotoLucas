package br.com.gama.implementacao;

import br.com.gama.lojaxpto.Cliente;
import br.com.gama.lojaxpto.Fabricante;
import br.com.gama.lojaxpto.Produto;
import br.com.gama.lojaxpto.Venda;

public class TesteVenda {
public static void main(String[] args) {
	
	
	Venda venda = new Venda(
			123,
			1000,
			new Cliente(
					"xpto",
					"xpto@xpto@.com"
					),
			new Produto(
					1,
					"churros",
					new Fabricante(
							"123456789",
							"lojinha",
							"942331139"
							),
					10,
					5,
					1000
					)			
			);
	
		System.out.println(venda.toString());
		System.out.println("Resumo" + venda.getResumo());
		System.out.println("total estoque venda:" + venda.getProduto().totalEstoqueVenda());
		System.out.println("total Estoque Compra:" + venda.getProduto().totalEstoqueCompra());
	
	
	
	
	
	
	
}
}
