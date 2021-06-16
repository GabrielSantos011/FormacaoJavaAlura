package br.com.alura.java.io.serializacao;

import java.io.Serializable;

//caso eu queira serializar um objeto que eu criei a classe deve implementar uma
//interface chamada Serializable. Eata interface está desde o java 1.1 se fosse mais recente
//seria uma notação pois ela é apenas uma marcação e não tem nenhum método
//é aconselhavel colocar o atributo serialVersionUID que serve para marcar versão
//se vc serializa em um UID e há alteração (principalmente em atributos) na classe vc
//troca esse UID e não é possível a desserialização
//caso não coloquemos esse atributo ele é gerado automaticamente
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
//obs: em caso de herança e agregações
//classes mães devem implementar o Serializable mesmo que nossa intenção seja serializar somente a filha
//caso a mãe já implemente não é necessário que o filho implemente pois ele já herda
//agregações - a classe agregada deve implementar o Serializable a menos que a gente não faça questão que
//essa agregação seja guardada - neste caso usamos a palavra chave transient - ex: private transient Objeto obj;
}
