package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private byte maximoPessoas;
	private byte andarMaximo;
	private byte andarMinimo;
	private byte andarAtual;
	private byte qtdePessoas;

	//sintaxe dos métodos
	//<modificador> <tipo do retorno>(<tipo param <nome param>,...)

	public void entrar() {
		if (this.qtdePessoas > maximoPessoas) {
			System.out.println("perdeu");
		}else {
			this.qtdePessoas =+ 1;
		}
	}	
	
	
	public String descer() {
		 andarAtual -= (byte) 1;
		 return System.out.println("perdeu");
	}

	
	public String subir() {
		if(andarAtual>andarMaximo) {
			System.out.println("proibido");
		}   else {
			return (andarAtual =+ (byte) 1);	
		}
	}
	


	public void sair( byte qtdePessoas) {
		if(qtdePessoas < 0) {
			System.out.println("Elevador Vazio");
		} else {
			qtdePessoas = (byte) (qtdePessoas - qtdePessoas);

		}
	}	


	public void entrar(byte qtdePessoas ) {
		if(this.qtdePessoas > maximoPessoas) {
			System.out.println("Elevador no máximo");
		} else {
			this.qtdePessoas = (byte) (this.qtdePessoas + this.qtdePessoas);
		}

	}



	public String toString() {
		return "Nome: .................." + nome + "\n" +
				"Maximo de Pessoas: ...." + nome + "\n" +
				"Andar Maximo: ........." + nome + "\n" +
				"Andar Minimo: ........." + andarMinimo + "\n" +
				"andarAtal:............ " + andarAtual + "\n" +
				"Quantidade de Pessoas: " + qtdePessoas;
	}


	public void inicializar(String pNome,byte pMaxPessoas,byte pAndarMax, byte pAndarMin) {

	}





}
