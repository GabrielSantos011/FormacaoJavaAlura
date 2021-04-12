package codigoParaDemonstrarExcecao;

public class TesteSimples {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a/0);
		//Ao executar esse código dará uma exceção pois não temos como fazer
		//uma divisão por 0 - existem várias exceções e o java separa por tipo e 
		//não por códigos além disso é deixado uma mensagem e a stackTrace
		//= rastro da pilha de execuão (este é um exemplo simples no próximo isso 
		//ficará mais claro)
		
		//erro esperado para esse código =
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
				//at codigoParaDemonstrarExcecao.Teste.main(Teste.java:8)

	}

}
