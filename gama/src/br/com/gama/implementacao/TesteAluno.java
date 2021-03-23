package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {
public static void main(String[] args) {
	Endereco endereco = new Endereco();
	
	endereco.setLogradouro("Avenida Itaquera");
	endereco.setNumero("385A");
	endereco.setComplemento("viela321");
	endereco.setBairro("Itaquera");
	endereco.setCidade("SaoPaulo");
	endereco.setUf("SP");endereco.setCep("06114-060");
		
	
	Aluno aluno = new Aluno();
	aluno.setEndereco(endereco);
	aluno.setEmail(JOptionPane.showInputDialog("Email:"));
	aluno.setFone(JOptionPane.showInputDialog("fone"));
	aluno.setNome(JOptionPane.showInputDialog("Nome"));
	aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula")));
	
	
	System.out.println("Nome:" + aluno.getNome());
	System.out.println("Email" + aluno.getEmail());
	System.out.println("Fone" + aluno.getFone());
	System.out.println("Matricula" + aluno.getMatricula());
	System.out.println("Endereco" + aluno.getEndereco());
	
	
	Aluno aluno2 = new Aluno();
	aluno2.setAll(
			endereco,
			JOptionPane.showInputDialog("nome"),
			Integer.parseInt(JOptionPane.showInputDialog("Matriucla2")),
			JOptionPane.showInputDialog("Email2"),
			JOptionPane.showInputDialog("Fone2")
			);
			
	System.out.println(aluno2.toString());
	
}
}
