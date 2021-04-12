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
			System.out.println(10/0);//c�digo para dar o erro
		}
		System.out.println("Fim do metodo2");
	}
	//explica��o:
	/*
	 *o erro � o meesmo do Teste simples por�m agora estamos no exemplificando na 
	 *pilha de execu��o. o erro est� n m�todo2() ent�o o JVM olha  
	 *"existe algum tratamento desse erro no m�todo dois?" n�o tendo ele interrompe
	 *a execu��o do m�todo - neste caso ele chega a printar o n�mero 1 logo em 
	 *seguida apresenta o erro como n�o h� tratamento ele interrompe (deixando de mostrar o 
	 *2,3,4,5)
	 *ao interromper ele volta para o m�todo que chamou ele, o metodo1() e l� faz a mesma 
	 *pergunta. "h� algum tratamento?" como n�o h� ele imterrompe tamb�m, deixando de 
	 *mostrar o "fim do metodo 1"
	 *ao interromper ele volta para ometodo main e o mesmo acontece e acaba a pilha de execu��o
	 *e n�o houve ningu�m capaz de resolvel ent�o ele mostra a exce��o na tela
	 *repare que a stackTrace mostra exatamente essa explica��o:
	 *Exception in thread "main" java.lang.ArithmeticException: / by zero
			at codigoParaDemonstrarExcecao.TesteComplexo.metodo2(TesteComplexo.java:21)
			at codigoParaDemonstrarExcecao.TesteComplexo.metodo1(TesteComplexo.java:13)
			at codigoParaDemonstrarExcecao.TesteComplexo.main(TesteComplexo.java:7)
	 *ele mostra onde foi parado no m�todo 2 1 e no main
	 */
	
}
