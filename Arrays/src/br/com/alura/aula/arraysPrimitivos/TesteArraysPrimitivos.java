package br.com.alura.aula.arraysPrimitivos;

public class TesteArraysPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Arrays são uma estrutura de dados em que podemos guardar uma quantidade pré definida de dados do mesmo tipo
		 * utilizam o new então são objetos
		 * new int [5] --> 5 posições (de 0 a 4)
		 */
		int [] lista = {1,2,3,4,5,6,7,8,9,10};
		
		int [] numeros = new int [10];
		
		//ao ser inicializado ele preenche com valores padrão
		//no caso de int é zero, mas caso fosse uma referencia como string seria null portanto temos que
		//ter cuidado para não tomarmos NullPointer
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = i;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
		
		//exceção por estourar o tamanho -  numeros vai de 0 a 4 portanto se eu tentar
		//usar alguma casa que n existe dara uma exceção
		
		System.out.println(numeros[10]);

	}

}
