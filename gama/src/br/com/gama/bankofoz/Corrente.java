package br.com.gama.bankofoz;

public class Corrente {
	
	private int id;
	private String nome;
	private String cpf;
	private String fones;
	
	
	public boolean sacar (float valor) {
		if (saldo <=0) {
			
			return 
		}
				
				
		return true
	}
	
	
	
	
	@Override
	public String toString() {
		return "Corrente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", fones=" + fones + "]";
	}
	public Corrente() {
		super();
	}
	public Corrente(int id, String nome, String cpf, String fones) {
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
	
	

	
	
	

}
