package br.com.alura.aula.arraysPrimitivos;

public class TesteArraysPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Arrays s�o uma estrutura de dados em que podemos guardar uma quantidade pr� definida de dados do mesmo tipo
		 * utilizam o new ent�o s�o objetos
		 * new int [5] --> 5 posi��es (de 0 a 4)
		 */
		int [] lista = {1,2,3,4,5,6,7,8,9,10};
		
		int [] numeros = new int [10];
		
		//ao ser inicializado ele preenche com valores padr�o
		//no caso de int � zero, mas caso fosse uma referencia como string seria null portanto temos que
		//ter cuidado para n�o tomarmos NullPointer
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = i;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
		
		//exce��o por estourar o tamanho -  numeros vai de 0 a 4 portanto se eu tentar
		//usar alguma casa que n existe dara uma exce��o
		
		System.out.println(numeros[10]);

	}

}
