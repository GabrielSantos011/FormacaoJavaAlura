package criandoExcecoes;

public class TesteChecked {

	/*para um melhor entendimento recomendo que analise esta classe primeiro pela ordem
	 inversa, do metodo2() para o main(String[] args)*/
	public static void main(String[] args) {
		//Neste método temos duas opções ou jogarmos o throws MinhaExcecao na assinatura 
		//mostrando que estamos cientes ou fazemos o tratamento da Exceção
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

	private static void metodo1() throws MinhaExcecao {//métodos que chamam métodos com a Exceção
		//cheked também são necessários colocar o throws mostrando que você esta ciente que 
		//passará um método com uma exceção checked
		//É IMPORTANTE NOTAR QUE: temos um try catch neste método mas a MinhaExcecao não
		//é tratada, portanto o throws foi necessário --> caso a exceção fosse tratada
		//não seria necessário tratar ou sinalizar algo no método main que chama o metodo1() 
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

	private static void metodo2() throws MinhaExcecao { // como eu não tenho um tratamento 
		//para essa exceção que é checked eu preciso demonstrar que eu estou ciente na 
		//assinatura do método
		System.out.println("Ini do metodo2");
		
		throw new MinhaExcecao("lancei a minha exceção");
	}

	
}
