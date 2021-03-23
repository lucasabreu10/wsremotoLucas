package br.com.rubinhocar.modelo;

public class Veiculo {

	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean status;
	private short velocidadeMaxima;
	private String modelo;
	
	
	//sintaxe dos métodos
	//<modificador> <tipo do retorno>(<tipo param <nome param>,...)
	
	public void desacelerar(short velocidade) {		
		if (status==true && (velocidadeAtual-velocidade)>=0) {
			velocidadeAtual-=velocidade;
		}
	}
	
	
	public void acelerar(short velocidade) {
		if (status==true && (velocidadeAtual+velocidade)<=velocidadeMaxima) {
			velocidadeAtual+=velocidade;
			
	}
		
		
	}
	
	public String desligar() {
		status = false;
		velocidadeAtual = 0;
		return "desligado";
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
	public String retornarMontadora() {
		return montadora;
	}
	
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
		valor = param;
	}
	
	public void preencherBasico(boolean pStatus, short pVelocidadeMaxima ) {
		status = pStatus;
		velocidadeMaxima = pVelocidadeMaxima;
	}
	
	public String  retornarTudo() {
		return 			  "Montadora: " + montadora + "\n" +
						 "Valor: " + valor + "\n" +
						 "VelocidadeAtual: " + velocidadeAtual + "\n"+
						 "Stauts: " + status + "\n" +
						 "Velocidade maxima: " + velocidadeMaxima + "\n" +
						 "Modelo: " + modelo +
						 "Velocidade Atual" + velocidadeAtual;
				
	}
	
	public float retornarDesconto() {
		return valor * (float) 0.9;	
	}
	 
	
	
	
}

