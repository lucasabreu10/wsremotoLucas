package br.com.gama.lojaxpto;

public class Cliente {
	
	private String cliente;
	private String email;
	
	
	
	public String getDocumentos() {
		return null;
	}
	
	
	public Cliente() {
		super();
	}
	public Cliente(String cliente, String email) {
		super();
		this.cliente = cliente;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [cliente=" + cliente + ", email=" + email + "]";
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	

}
