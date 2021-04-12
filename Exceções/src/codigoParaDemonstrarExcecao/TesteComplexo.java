package codigoParaDemonstrarExcecao;

public class TesteComplexo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			System.out.println(10/0);//código para dar o erro
		}
		System.out.println("Fim do metodo2");
	}
	//explicação:
	/*
	 *o erro é o meesmo do Teste simples porém agora estamos no exemplificando na 
	 *pilha de execução. o erro está n método2() então o JVM olha  
	 *"existe algum tratamento desse erro no método dois?" não tendo ele interrompe
	 *a execução do método - neste caso ele chega a printar o número 1 logo em 
	 *seguida apresenta o erro como não há tratamento ele interrompe (deixando de mostrar o 
	 *2,3,4,5)
	 *ao interromper ele volta para o método que chamou ele, o metodo1() e lá faz a mesma 
	 *pergunta. "há algum tratamento?" como não há ele imterrompe também, deixando de 
	 *mostrar o "fim do metodo 1"
	 *ao interromper ele volta para ometodo main e o mesmo acontece e acaba a pilha de execução
	 *e não houve ninguém capaz de resolvel então ele mostra a exceção na tela
	 *repare que a stackTrace mostra exatamente essa explicação:
	 *Exception in thread "main" java.lang.ArithmeticException: / by zero
			at codigoParaDemonstrarExcecao.TesteComplexo.metodo2(TesteComplexo.java:21)
			at codigoParaDemonstrarExcecao.TesteComplexo.metodo1(TesteComplexo.java:13)
			at codigoParaDemonstrarExcecao.TesteComplexo.main(TesteComplexo.java:7)
	 *ele mostra onde foi parado no método 2 1 e no main
	 */
	
}
