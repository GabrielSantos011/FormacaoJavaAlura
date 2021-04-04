//uma classe é um tipo - um molde para um objeto
public class Conta {

	// aqui declaramos os atributos de uma classe (suas caracteristicas)
	private int agencia; // private significa que somente essa classe tem acesso
	private int conta;
	private double saldo;
	private Cliente titular; // uma ligação com outra classe
	private static int totalContas; // ao colocar o static estou dizendo que ele pertence a classe e
									// não ao objeto, sendo assim para acessar de maneira formal faço
									// Conta.totalContas

	// construtores
	/*
	 * não são métodos (não tem retorno -sequer void) mas sim uma rotina a ser
	 * seguida assim que o objeto for instanciado o primeiro construtor que fiz aqui
	 * é o chamado construtor padrão - caso eu não escreva nenhum o java já adiciona
	 * ele automaticamente para mim, porém a partir do momento que eu escrevi outro
	 * construtor o java não adiciona mais não posso ter quantos construtores eu
	 * quiser e de uma maneira geral eles são normalmente utilizados para
	 * inicialização de alguns atributos mais importantes, neste caso de conta seria
	 * interessante já inicializarmos agencia, conta e cliente
	 */
	public Conta() {
		this.totalContas++;
	}

	public Conta(int agencia, int conta, Cliente titular) {
		this.agencia = agencia; // este comando this eu estou dizendo que é a agencia do objeto em uso
		this.conta = conta;
		this.titular = titular;
		this.totalContas++;
	}

	// apenas como curiosidade - caso houvesse alguma situação em que a agencia e
	// conta fosse padrão eu não precisaria reescrever código
	public Conta(Cliente titular) {
		this(1111, 111111, titular);
	}

	// diferente de variaveis declaradas em métodos que não tem valor padrão os
	// atributos de uma classe tem.
	// sendo que os numéricos são 0 e os objetos null - um erro comum por conta
	// disso é o NullPointerExcepition
	// quando vc pede por exemplo para que mostre um string que está nula ou sejja
	// sem apontar para nada

	// aqui declaramos os comportamentos além dos getters and setters necessários -
	// dependendo do seu negócio nem todos os getters
	// e setters são necessários
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

	public static int getTotalContas() {// método static pois é da classe e não do objeto
		return totalContas;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido");
			return;
		}
		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= 0 || valor > this.saldo) {
			System.out.println("Valor inválido");
			return;
		}
		this.saldo -= valor;
	}

	public void transferir(double valor, Conta conta) {
		if (valor > this.saldo)
			System.out.println("Valor inválido");
		this.saldo -= valor;
		conta.depositar(valor);
	}

}
