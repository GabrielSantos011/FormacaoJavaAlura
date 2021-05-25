package Lista;

public class Conta {
	
	private int numeroConta;
	
	public Conta(int n) {
		this.numeroConta = n;
	}

	@Override
	public String toString() {
		return "Esta é a conta " + numeroConta;
	}
	public int getNumeroConta() {
		return this.numeroConta;
	}
}
