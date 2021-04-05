
public class Funcionario { // classe mãe, classe base, super classe

	private String nome;
	private String cpf;
	protected double salario; // variavel do tipo protected significa que para as classes
								// filhas este atributo fica disponível e não bloqueado
								// (tem visibilidade package)
								// não é tão usual visto que geralmente se precisarmos acessar as variaveis
								// utilizariamos os métodos get e set -fica aqui apenas por aprendizado

	public double getBonificacao() {// apesar do nome do método ser get
									// não se trata de um atributo, algo comum tb
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
