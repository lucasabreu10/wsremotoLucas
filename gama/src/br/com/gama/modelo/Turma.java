package br.com.gama.modelo;

public class Turma {
	
	private String Sigla;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	private Curso descricao;
	
	
	
	public Curso getDescricao() {
		return descricao;
	}
	public void setDescricao(Curso descricao) {
		this.descricao = descricao;
	}
	public String getResumo() {
		return "nomedoaluno" + aluno.getNome() + "nomeprofessor:" + professor.getNome() + "Descri??o" + curso.getDescricao() + "Sigla turma" + Sigla;
}
	public String getSigla() {
		return Sigla;
	}
	public void setSigla(String sigla) {
		Sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Turma [Sigla=" + Sigla + ", periodo=" + periodo + ", curso=" + curso + ", aluno=" + aluno
				+ ", professor=" + professor + "]";
	}
	
	

}
