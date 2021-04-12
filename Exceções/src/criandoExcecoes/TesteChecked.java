package criandoExcecoes;

public class TesteChecked {

	/*para um melhor entendimento recomendo que analise esta classe primeiro pela ordem
	 inversa, do metodo2() para o main(String[] args)*/
	public static void main(String[] args) {
		//Neste m�todo temos duas op��es ou jogarmos o throws MinhaExcecao na assinatura 
		//mostrando que estamos cientes ou fazemos o tratamento da Exce��o
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (MinhaExcecao ex) {
			System.out.println("o motivo do erro foi:");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {//m�todos que chamam m�todos com a Exce��o
		//cheked tamb�m s�o necess�rios colocar o throws mostrando que voc� esta ciente que 
		//passar� um m�todo com uma exce��o checked
		//� IMPORTANTE NOTAR QUE: temos um try catch neste m�todo mas a MinhaExcecao n�o
		//� tratada, portanto o throws foi necess�rio --> caso a exce��o fosse tratada
		//n�o seria necess�rio tratar ou sinalizar algo no m�todo main que chama o metodo1() 
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

	private static void metodo2() throws MinhaExcecao { // como eu n�o tenho um tratamento 
		//para essa exce��o que � checked eu preciso demonstrar que eu estou ciente na 
		//assinatura do m�todo
		System.out.println("Ini do metodo2");
		
		throw new MinhaExcecao("lancei a minha exce��o");
	}

	
}
