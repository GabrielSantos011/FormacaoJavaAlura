package Lista;

public class Conta {
	
	private long numeroConta;
	
	public Conta(long n) {
		this.numeroConta = n;
	}

	@Override
	public String toString() {
		return "Esta � a conta " + numeroConta;
	}
	public long getNumeroConta() {
		return this.numeroConta;
	}
}
