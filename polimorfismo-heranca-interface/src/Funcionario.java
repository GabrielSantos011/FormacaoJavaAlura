
public class Funcionario { // classe m�e, classe base, super classe

	private String nome;
	private String cpf;
	protected double salario; // variavel do tipo protected significa que para as classes
								// filhas este atributo fica dispon�vel e n�o bloqueado
								// (tem visibilidade package)
								// n�o � t�o usual visto que geralmente se precisarmos acessar as variaveis
								// utilizariamos os m�todos get e set -fica aqui apenas por aprendizado

	public double getBonificacao() {// apesar do nome do m�todo ser get
									// n�o se trata de um atributo, algo comum tb
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
