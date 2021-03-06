package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.gama.util.Magica;

public class TesteConta {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente(
				
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("CPF"),
				Magica.s("Fone")				
					
				
				);
		
		Conta conta = new Conta();
		if(Magica.b("Abrir conta coorrente:")==true){
			conta = new Corrente(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("saldo"),
					cliente,
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
		}else {
			conta = new Poupanca(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("saldo"),
					cliente,
					Magica.f("Rendimento")
							);
		}
		
		//colocou somente conta pois existe o tostring l? no conta e ele carrega por padr?o
		System.out.println(conta);
		conta.sacar(1000);
		System.out.println("ap?s sacar:" + conta.verificarSaldo());
		System.out.println(conta.depositar(1550));
		System.out.println("ap?s depositar:" + conta.verificarSaldo());
		
		
		if(conta instanceof Corrente) {
			((Corrente) conta).aumentarLimite(15);
			System.out.println("Limite"+((Corrente) conta).getLimite());
		}
		else if(conta instanceof Poupanca){
			((Poupanca) conta).creditarRendimentos();
			System.out.println("Saldo apos credita rendimento:" + conta.verificarSaldo());
		}
		
		
		
	}
	
	
	
	
	
}
