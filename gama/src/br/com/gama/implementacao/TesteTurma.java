package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;

public class TesteTurma {

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
		aluno.setEmail("lucas_n_abreu@hotmail.com");
		aluno.setFone("36850912");
		aluno.setNome("Lucas Abreu");
		aluno.setMatricula(10);

		Professor professor = new Professor ();
		professor.setNome("Cassio");
		professor.setFormacao("Portugues");
		professor.setArea("portgues");
		professor.setEndereco(endereco);

		System.out.println(professor.getResumo());


		Curso curso = new Curso();

		curso.setValor(1000);
		curso.setDescricao("Bemchato");

		Turma turma = new Turma();
		turma.setSigla("PT");


		System.out.println(turma.getResumo());



	}







}







