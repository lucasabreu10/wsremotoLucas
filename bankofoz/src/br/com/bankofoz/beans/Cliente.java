package br.com.bankofoz.beans;

import br.com.gama.util.PadraoBasico;

public class Cliente implements PadraoBasico{
	
	private int id;
	private String nome;
	private String cpf;
	private String fones;
	
		@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", fones=" + fones + "]";
	}
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String cpf, String fones) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.fones = fones;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFones() {
		return fones;
	}
	public void setFones(String fones) {
		this.fones = fones;
	}
	
	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
