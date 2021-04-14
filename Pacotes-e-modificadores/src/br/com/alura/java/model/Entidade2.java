//primeira coisa no código deve ser o package, antes só pode ter comentários
//caso não utilize pacotes (default package não é necessário)
//utilizado para maior organização
//padrao é site ao contrario.nome do projeto:
package br.com.alura.java.model;

public class Entidade2 {
	/*
	 * sobre os modificadores de acesso 
	 * public - visivel para todo mundo
	 * protected - visível dentro do pacote e para herança funciona como public,
	 * ou seja, classes filhas veem o atributo/metodo como public
	 * default/package - este caso não tem uma palavra chave, caso não tina nada a frente
	 * como por exemplo int a; ele é package, visivel apenas no pacotes
	 * private - visivel apenas na classe
	 * obs: classe só pode ser package ou public - metodos e atributos podem todos
	 */
	private String atributo;

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
}
