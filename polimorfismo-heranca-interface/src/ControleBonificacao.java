
public class ControleBonificacao {
	private static double valorBonificacao;

	public double registraBonificacao(Funcionario f) {

		valorBonificacao += f.getBonificacao();
		return valorBonificacao;

	}
	
	public static double getValorBonificacao() {
		return valorBonificacao;
	}
}
