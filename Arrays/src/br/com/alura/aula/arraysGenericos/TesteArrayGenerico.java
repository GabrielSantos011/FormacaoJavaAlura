package br.com.alura.aula.arraysGenericos;

public class TesteArrayGenerico {
	
	public static void main(String args[]) {
		
		Object arrayGenerico [] = new Object[5];
		
		arrayGenerico[0] = new ContaCorrente();
		
		ContaCorrente cc = (ContaCorrente) arrayGenerico[0]; //toda conta corrente é object portanto este cast é possível
		ContaPoupanca cp = (ContaPoupanca) arrayGenerico[0]; // isto compila mas dara um erro de cast - eu falei que era uma cp mas na vdd é uma cc
		
		Conta arrayConta [] = new Conta[5];
		
		Cliente cliente = new Cliente();
		
		//arrayConta[0] = (Conta) cliente;~- este é um cast impossível
	}

}
