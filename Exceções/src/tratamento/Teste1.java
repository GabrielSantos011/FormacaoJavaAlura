package tratamento;

public class Teste1 {

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
			try {
				System.out.println(10 / 0);
				// todo código que pode ocasionar um erro é colocado dentro do try
				// obrigatóriamente todo try tem um catch - que captura a exceção
				// e faz o tratameto, ou seja oq queromos que aconteça caso apressente um erro
			} catch (ArithmeticException ex) {
				//o catch tem o tipo da exceção e portanto o ex é uma referencia, podemos assim
				//usar para alguns métodos
				System.out.println("o motivo do erro foi:");
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
			//como temos um tratamento para o erro ocorrido não há interrupção, cada laço do for
			//que for dar o erro vai para o catch
		}
		System.out.println("Fim do metodo2");
	}

}
