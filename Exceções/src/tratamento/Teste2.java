package tratamento;

public class Teste2 {
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
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			System.out.println(10 / 0);// c�digo para dar o erro
		}
		System.out.println("Fim do metodo2");
	}
	/*
	 * note que nesse caso colocamos o tratamento no metodo1() ent�o ao acontecer
	 * a exce��o no metodo2() ele verifica ah um tratamento? n�o h�, portanto
	 * ele interrompe a execu��o do metodo2() e vai para o metodo1() e verifica se l� 
	 * h� tratamento
	 * h� tratamento ent�o o erro foi tratado e pode continuar a execu��o a partir dali o
	 * programa serve normalmente 
	 */
	
}
