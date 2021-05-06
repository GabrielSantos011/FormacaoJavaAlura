package br.com.alura.aula.arraysReferencia;

public class TesteArraysReferencia {

	public static void main(String[] args) {
		
		/*
		 * Arrays s�o uma estrutura de dados em que podemos guardar uma quantidade pr� definida de dados do mesmo tipo
		 * utilizam o new ent�o s�o objetos
		 * arrays de referencia
		 * ao ser inicializado ele preenche com valores padr�o
		 * caso string --> null portanto temos que ter cuidado para n�o tomarmos NullPointer
		 */
		
		String [] palavras = new String [10];
		
		System.out.println(palavras[0]);//mostrando que � null
		palavras[0] = new String("Arroz");
		palavras[1] = "Feij�o";
		
		for (int i = 0; i < 10; i++) {
			System.out.println(palavras[i]);
		}
		
		//para demonstrar o exce��o null pointer
		palavras[9].charAt(3); // ainda n foi inicializado -- dara uma exce��o

	}

}
