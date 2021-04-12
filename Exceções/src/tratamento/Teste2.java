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
			System.out.println(10 / 0);// código para dar o erro
		}
		System.out.println("Fim do metodo2");
	}
	/*
	 * note que nesse caso colocamos o tratamento no metodo1() então ao acontecer
	 * a exceção no metodo2() ele verifica ah um tratamento? não há, portanto
	 * ele interrompe a execução do metodo2() e vai para o metodo1() e verifica se lá 
	 * há tratamento
	 * há tratamento então o erro foi tratado e pode continuar a execução a partir dali o
	 * programa serve normalmente 
	 */
	
}
