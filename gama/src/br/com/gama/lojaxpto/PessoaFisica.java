package br.com.gama.lojaxpto;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	
	public String getDocumentos() {
		return cpf + "-" + rg;
	}
	
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}




	public void setRg(String rg) {
		this.rg = rg;
	}



	public PessoaFisica() {
		super();
	}








	public PessoaFisica(String cliente, String email, String cpf, String rg) {
		super(cliente, email);
		this.cpf = cpf;
		this.rg = rg;
	}








	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + "," + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
