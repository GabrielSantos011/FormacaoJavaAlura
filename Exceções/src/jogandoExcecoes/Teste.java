package jogandoExcecoes;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch(ArithmeticException ex) {
			System.out.println("o motivo do erro foi:");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		
		//A exce��o � um tipo portanto podemos fazer uma instacia para que n�s mesmos joguemos
		//uma exce��o -  e a palavra para o java � essa mesmo - jogar (throw)
		
		ArithmeticException ex = new ArithmeticException();//instancia da ArithmeticException
		//e a referencia est� na v�riavel ex
		throw ex;// nestes momento joguei a exce��o, ou seja o c�digo vai ser paralisado aqui
		// tudo que eu colocar aqui para baixo j� da erro pq ao jogar a exce��o o c�digo � 
		//interrompido - por isso vou comentar o c�digo abaixo
		//Aqui � diferente de um caso que pode vir a causar um erro (como NullPointer), aqui o
		//erro j� est� lan�ado.
		
		//System.out.println("Fim do metodo2");
	}
	/*
	 * � importante notar que a referencia agora n�o � mais necess�ria como no catch
	 * ent�o � muito comum jogarmos a exception instanciando ela direto no throw
	 * throw new ArithmeticException();
	 * outro ponto importante � que n�s estamos instanciando essa classe ent�o ela vem com
	 * mensagem nula (para o m�todo getMessage()) e podemos passar nossa mensagem no construtor
	 * throw new ArithmeticException("mensagem do erro")
	 */	
}
