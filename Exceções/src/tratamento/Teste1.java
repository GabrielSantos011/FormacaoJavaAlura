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
				// todo c�digo que pode ocasionar um erro � colocado dentro do try
				// obrigat�riamente todo try tem um catch - que captura a exce��o
				// e faz o tratameto, ou seja oq queromos que aconte�a caso apressente um erro
			} catch (ArithmeticException ex) {
				//o catch tem o tipo da exce��o e portanto o ex � uma referencia, podemos assim
				//usar para alguns m�todos
				System.out.println("o motivo do erro foi:");
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
			//como temos um tratamento para o erro ocorrido n�o h� interrup��o, cada la�o do for
			//que for dar o erro vai para o catch
		}
		System.out.println("Fim do metodo2");
	}

}
