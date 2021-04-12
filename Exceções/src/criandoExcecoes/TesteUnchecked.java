package criandoExcecoes;


public class TesteUnchecked {

	/*para um melhor entendimento recomendo que analise esta classe primeiro pela ordem
	 inversa, do metodo2() para o main(String[] args)*/
	
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (MinhaExcecao2 ex) {
			System.out.println("o motivo do erro foi:");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
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
		
		//Aqui estou lançando a exceção mas repare que o compilador não faz nenhuma checagem,
		//se eu estou ciente ou tratando este erro
		//vai do programador se ele quer tratar ou deixar o erro aparecer no console (pois nesse 
		//caso eu lancei a exception então se não tiver tratamento ela ira interromper
		//método por método.)
		throw new MinhaExcecao2("lancei a minha exceção");
	}

	
}
