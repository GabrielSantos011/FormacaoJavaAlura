//uma classe � um tipo - um molde para um objeto
public class Conta {

	// aqui declaramos os atributos de uma classe (suas caracteristicas)
	private int agencia; // private significa que somente essa classe tem acesso
	private int conta;
	private double saldo;
	private Cliente titular; // uma liga��o com outra classe
	private static int totalContas; // ao colocar o static estou dizendo que ele pertence a classe e
									// n�o ao objeto, sendo assim para acessar de maneira formal fa�o
									// Conta.totalContas

	// construtores
	/*
	 * n�o s�o m�todos (n�o tem retorno -sequer void) mas sim uma rotina a ser
	 * seguida assim que o objeto for instanciado o primeiro construtor que fiz aqui
	 * � o chamado construtor padr�o - caso eu n�o escreva nenhum o java j� adiciona
	 * ele automaticamente para mim, por�m a partir do momento que eu escrevi outro
	 * construtor o java n�o adiciona mais n�o posso ter quantos construtores eu
	 * quiser e de uma maneira geral eles s�o normalmente utilizados para
	 * inicializa��o de alguns atributos mais importantes, neste caso de conta seria
	 * interessante j� inicializarmos agencia, conta e cliente
	 */
	public Conta() {
		this.totalContas++;
	}

	public Conta(int agencia, int conta, Cliente titular) {
		this.agencia = agencia; // este comando this eu estou dizendo que � a agencia do objeto em uso
		this.conta = conta;
		this.titular = titular;
		this.totalContas++;
	}

	// apenas como curiosidade - caso houvesse alguma situa��o em que a agencia e
	// conta fosse padr�o eu n�o precisaria reescrever c�digo
	public Conta(Cliente titular) {
		this(1111, 111111, titular);
	}

	// diferente de variaveis declaradas em m�todos que n�o tem valor padr�o os
	// atributos de uma classe tem.
	// sendo que os num�ricos s�o 0 e os objetos null - um erro comum por conta
	// disso � o NullPointerExcepition
	// quando vc pede por exemplo para que mostre um string que est� nula ou sejja
	// sem apontar para nada

	// aqui declaramos os comportamentos al�m dos getters and setters necess�rios -
	// dependendo do seu neg�cio nem todos os getters
	// e setters s�o necess�rios
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContas() {// m�todo static pois � da classe e n�o do objeto
		return totalContas;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inv�lido");
			return;
		}
		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= 0 || valor > this.saldo) {
			System.out.println("Valor inv�lido");
			return;
		}
		this.saldo -= valor;
	}

	public void transferir(double valor, Conta conta) {
		if (valor > this.saldo)
			System.out.println("Valor inv�lido");
		this.saldo -= valor;
		conta.depositar(valor);
	}

}
