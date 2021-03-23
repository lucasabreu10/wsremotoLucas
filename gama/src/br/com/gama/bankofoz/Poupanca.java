package br.com.gama.bankofoz;

public class Poupanca extends Conta{
	
	private float rendimento;
	
	
	public boolean sacar(float valor) {
		if (super.getSaldo()<0) {
			System.out.println("SemSaldo");
			return false;
		}else {
			super.setSaldo(float saldo) = valor -- 
			return true;
	}
	
	public void creditarRendimentos() {
		rendimento = rendimento*  super.setSaldo(getSaldo());
	}
	

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "saldo"+ super.getSaldo() + "]";
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	

}
