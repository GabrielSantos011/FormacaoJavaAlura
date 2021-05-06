package br.com.alura.aula.arraysReferencia;

public class TesteArraysReferencia {

	public static void main(String[] args) {
		
		/*
		 * Arrays são uma estrutura de dados em que podemos guardar uma quantidade pré definida de dados do mesmo tipo
		 * utilizam o new então são objetos
		 * arrays de referencia
		 * ao ser inicializado ele preenche com valores padrão
		 * caso string --> null portanto temos que ter cuidado para não tomarmos NullPointer
		 */
		
		String [] palavras = new String [10];
		
		System.out.println(palavras[0]);//mostrando que é null
		palavras[0] = new String("Arroz");
		palavras[1] = "Feijão";
		
		for (int i = 0; i < 10; i++) {
			System.out.println(palavras[i]);
		}
		
		//para demonstrar o exceção null pointer
		palavras[9].charAt(3); // ainda n foi inicializado -- dara uma exceção

	}

}
