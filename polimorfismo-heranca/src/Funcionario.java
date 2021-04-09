
public abstract class Funcionario { // classe mãe, classe base, super classe
	//algo abstrato é algo não concreto então com esta pavra eu não deixo dar um new Funcionario(),
	//apenas de seus filhos - até pq não queremos que haja apenas um funcionario (isso não existe)
	// devemos dizer que somos programadores ou gerente ...
	// classes abstratas podem ter atributos, métodos abstratos ou não e construtores normalmente - só n podemos dar o new
	private String nome;
	private String cpf;
	protected double salario; // variavel do tipo protected significa que para as classes
								// filhas este atributo fica disponível e não bloqueado
								// (tem visibilidade package)
								// não é tão usual visto que geralmente se precisarmos acessar as variaveis
								// utilizariamos os métodos get e set -fica aqui apenas por aprendizado

	/*Este método é um forte candidato para ser abstrato.
	 * abstrato em métodos significa que ele não tem uma implementação aqui mas sim em seus filhos
	 * passa uma sensação de incompleto, tal que a classe filha só não seria obrigada a implementar
	 * caso implementasse o abstract também
	 * para manter o exemplo de sobreescrita não irei alterar mas fica essa anotação além de que terei exemplos de interfaces
	 * vale lembrar que ao colocar um método como abstrato a classe se torna abstrata
	 * caso fosse abstrato seria:
	 * public abstract double getBonificacao();*/
	public double getBonificacao() {// apesar do nome do método ser get
									// não se trata de um atributo, algo comum tb
		System.out.println("método de bonificacao do funcionario");
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
