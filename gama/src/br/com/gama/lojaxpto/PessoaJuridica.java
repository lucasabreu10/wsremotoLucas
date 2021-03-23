package br.com.gama.lojaxpto;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String contato;
	private String ie;
	
		public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String cliente, String email, String cnpj, String contato, String ie) {
		super(cliente, email);
		this.cnpj = cnpj;
		this.contato = contato;
		this.ie = ie;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + ", ie=" + ie + "," + super.toString()  +   "]";
	}
	
	
	
	
	
	

}
