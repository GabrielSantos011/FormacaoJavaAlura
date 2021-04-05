
public class Gerente extends Funcionario {
	// Gerente é um funcionario, ou , gerente herda de funcionário
	/*
	 * A classe filha herda todas as variaveis (podendo somente acessar diretamente
	 * as protected e public) e todos os métodos publicos para acessarmos usamos ao
	 * invés do this o super dizendo que vem da superclasse
	 */

	private int senha;

	@Override
	public double getBonificacao() {// este método já existe em funcionario, para o escopo do projeto foi
									// interessante que
									// o gerente tivesse uma bonificação diferente de um funcionário comum portanto
									// estamos
									// reescrevendo este método podemos usar a notação @Override que nos ajuda caso
									// tenhamos errado a assinatura
		/*
		 * há também a possibilidade de uma sobrecarga que seria criar um método com o
		 * mesmo nome porém com retorno e/ou parametros diferentes
		 */
		return super.getBonificacao() + super.salario; //super pq não é propriamente mas sim da super classe
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
