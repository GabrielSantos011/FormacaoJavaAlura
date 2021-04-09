
public abstract class Funcionario { // classe m�e, classe base, super classe
	//algo abstrato � algo n�o concreto ent�o com esta pavra eu n�o deixo dar um new Funcionario(),
	//apenas de seus filhos - at� pq n�o queremos que haja apenas um funcionario (isso n�o existe)
	// devemos dizer que somos programadores ou gerente ...
	// classes abstratas podem ter atributos, m�todos abstratos ou n�o e construtores normalmente - s� n podemos dar o new
	private String nome;
	private String cpf;
	protected double salario; // variavel do tipo protected significa que para as classes
								// filhas este atributo fica dispon�vel e n�o bloqueado
								// (tem visibilidade package)
								// n�o � t�o usual visto que geralmente se precisarmos acessar as variaveis
								// utilizariamos os m�todos get e set -fica aqui apenas por aprendizado

	/*Este m�todo � um forte candidato para ser abstrato.
	 * abstrato em m�todos significa que ele n�o tem uma implementa��o aqui mas sim em seus filhos
	 * passa uma sensa��o de incompleto, tal que a classe filha s� n�o seria obrigada a implementar
	 * caso implementasse o abstract tamb�m
	 * para manter o exemplo de sobreescrita n�o irei alterar mas fica essa anota��o al�m de que terei exemplos de interfaces
	 * vale lembrar que ao colocar um m�todo como abstrato a classe se torna abstrata
	 * caso fosse abstrato seria:
	 * public abstract double getBonificacao();*/
	public double getBonificacao() {// apesar do nome do m�todo ser get
									// n�o se trata de um atributo, algo comum tb
		System.out.println("m�todo de bonificacao do funcionario");
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
