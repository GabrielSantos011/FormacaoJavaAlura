package codigoParaDemonstrarExcecao;

public class TesteSimples {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a/0);
		//Ao executar esse c�digo dar� uma exce��o pois n�o temos como fazer
		//uma divis�o por 0 - existem v�rias exce��es e o java separa por tipo e 
		//n�o por c�digos al�m disso � deixado uma mensagem e a stackTrace
		//= rastro da pilha de execu�o (este � um exemplo simples no pr�ximo isso 
		//ficar� mais claro)
		
		//erro esperado para esse c�digo =
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
				//at codigoParaDemonstrarExcecao.Teste.main(Teste.java:8)

	}

}
