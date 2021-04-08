
public class ControleBonificacao {
	private static double valorBonificacao;

	//exemplo do polimorfismo
	//no java podemos fazer Funcionario f = new Gerente()
	//então com isso podemos receber qualquer tipo de funcionario nesse método
	public double registraBonificacao(Funcionario f) {

		valorBonificacao += f.getBonificacao();
		return valorBonificacao;

	}
	
	public static double getValorBonificacao() {
		return valorBonificacao;
	}
}
