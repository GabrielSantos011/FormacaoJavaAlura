public abstract class Conta {
//algo abstrato é algo não concreto então com esta pavra eu não deixo dar um new Funcionario(),
//apenas de seus filhos - até pq não queremos que haja só uma conta, deve ser corrente ou poupança
	// classes abstratas podem ter atributos, métodos abstratos ou não e construtores normalmente - só n podemos dar o new
	private int agencia;
	private int conta;
	private double saldo;
	private Cliente titular;
	private static int totalContas;

	public Conta(int agencia, int conta, Cliente titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		Conta.totalContas++;
	}

	public Conta(Cliente titular) {
		this(1111, 111111, titular);
	}

	public Conta(int agencia, int conta) {
		this.agencia = agencia;
		this.conta = conta;
	}

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
