package br.com.alura.java.io.serializacao;

import java.io.Serializable;

//caso eu queira serializar um objeto que eu criei a classe deve implementar uma
//interface chamada Serializable. Eata interface est� desde o java 1.1 se fosse mais recente
//seria uma nota��o pois ela � apenas uma marca��o e n�o tem nenhum m�todo
//� aconselhavel colocar o atributo serialVersionUID que serve para marcar vers�o
//se vc serializa em um UID e h� altera��o (principalmente em atributos) na classe vc
//troca esse UID e n�o � poss�vel a desserializa��o
//caso n�o coloquemos esse atributo ele � gerado automaticamente
public class Objeto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String arg1="";
	
	public String getArg1() {
		return arg1;
	}
	
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
//obs: em caso de heran�a e agrega��es
//classes m�es devem implementar o Serializable mesmo que nossa inten��o seja serializar somente a filha
//caso a m�e j� implemente n�o � necess�rio que o filho implemente pois ele j� herda
//agrega��es - a classe agregada deve implementar o Serializable a menos que a gente n�o fa�a quest�o que
//essa agrega��o seja guardada - neste caso usamos a palavra chave transient - ex: private transient Objeto obj;
}
