//primeira coisa no c�digo deve ser o package, antes s� pode ter coment�rios
//caso n�o utilize pacotes (default package n�o � necess�rio)
//utilizado para maior organiza��o
//padrao � site ao contrario.nome do projeto:
package br.com.alura.java.model;

public class Entidade2 {
	/*
	 * sobre os modificadores de acesso 
	 * public - visivel para todo mundo
	 * protected - vis�vel dentro do pacote e para heran�a funciona como public,
	 * ou seja, classes filhas veem o atributo/metodo como public
	 * default/package - este caso n�o tem uma palavra chave, caso n�o tina nada a frente
	 * como por exemplo int a; ele � package, visivel apenas no pacotes
	 * private - visivel apenas na classe
	 * obs: classe s� pode ser package ou public - metodos e atributos podem todos
	 */
	private String atributo;

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
}
