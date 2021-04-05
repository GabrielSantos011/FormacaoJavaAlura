
public class ContaPoupanca extends Conta {
	/* na herança não herdamos os construtores
	 * caso o construtor da classe mãe for o padrão não há problema
	 * ja que o java assim como cria o construtor defaulf ele coloca o super() indicando
	 * que estamos chamando o construtor na classe mãe
	 * No caso de a classe mão ter um construtor que não é p default devemos  chamar ele 
	 * no nosso construtor
	 */
	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
	}
}
