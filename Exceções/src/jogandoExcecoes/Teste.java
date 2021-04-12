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
		
		//A exceção é um tipo portanto podemos fazer uma instacia para que nós mesmos joguemos
		//uma exceção -  e a palavra para o java é essa mesmo - jogar (throw)
		
		ArithmeticException ex = new ArithmeticException();//instancia da ArithmeticException
		//e a referencia está na váriavel ex
		throw ex;// nestes momento joguei a exceção, ou seja o código vai ser paralisado aqui
		// tudo que eu colocar aqui para baixo já da erro pq ao jogar a exceção o código é 
		//interrompido - por isso vou comentar o código abaixo
		//Aqui é diferente de um caso que pode vir a causar um erro (como NullPointer), aqui o
		//erro já está lançado.
		
		//System.out.println("Fim do metodo2");
	}
	/*
	 * É importante notar que a referencia agora não é mais necessária como no catch
	 * então é muito comum jogarmos a exception instanciando ela direto no throw
	 * throw new ArithmeticException();
	 * outro ponto importante é que nós estamos instanciando essa classe então ela vem com
	 * mensagem nula (para o método getMessage()) e podemos passar nossa mensagem no construtor
	 * throw new ArithmeticException("mensagem do erro")
	 */	
}
