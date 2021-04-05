
public class ContaCorrente extends Conta {
	/* na heran�a n�o herdamos os construtores
	 * caso o construtor da classe m�e for o padr�o n�o h� problema
	 * ja que o java assim como cria o construtor defaulf ele coloca o super() indicando
	 * que estamos chamando o construtor na classe m�e
	 * No caso de a classe m�o ter um construtor que n�o � p default devemos  chamar ele 
	 * no nosso construtor
	 */
	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}
}
