
public class Gerente extends Funcionario {
	// Gerente � um funcionario, ou , gerente herda de funcion�rio
	/*
	 * A classe filha herda todas as variaveis (podendo somente acessar diretamente
	 * as protected e public) e todos os m�todos publicos para acessarmos usamos ao
	 * inv�s do this o super dizendo que vem da superclasse
	 */

	private int senha;

	@Override
	public double getBonificacao() {// este m�todo j� existe em funcionario, para o escopo do projeto foi
									// interessante que
									// o gerente tivesse uma bonifica��o diferente de um funcion�rio comum portanto
									// estamos
									// reescrevendo este m�todo podemos usar a nota��o @Override que nos ajuda caso
									// tenhamos errado a assinatura
		/*
		 * h� tamb�m a possibilidade de uma sobrecarga que seria criar um m�todo com o
		 * mesmo nome por�m com retorno e/ou parametros diferentes
		 */
		return super.getBonificacao() + super.salario; //super pq n�o � propriamente mas sim da super classe
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
