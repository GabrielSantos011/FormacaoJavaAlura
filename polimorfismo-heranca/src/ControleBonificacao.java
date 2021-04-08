
public class ControleBonificacao {
	private static double valorBonificacao;

	//exemplo do polimorfismo
	//no java podemos fazer Funcionario f = new Gerente()
	//ent�o com isso podemos receber qualquer tipo de funcionario nesse m�todo
	public double registraBonificacao(Funcionario f) {

		valorBonificacao += f.getBonificacao();
		return valorBonificacao;

	}
	
	public static double getValorBonificacao() {
		return valorBonificacao;
	}
}
