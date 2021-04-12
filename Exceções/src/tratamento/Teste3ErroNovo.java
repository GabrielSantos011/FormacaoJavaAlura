package tratamento;

public class Teste3ErroNovo {
	static Objeto objeto;
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException ex) {
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
			//novo erro - null pointer 
			//pois n demos o new e estamos tentando acessar uma referencia que aponta
			//para null
			objeto.atributo=1;
		}
		System.out.println("Fim do metodo2");
	}
	/*
	 * Observe que desta vez mesmo tendo um try ali no metodo1 não conseguimos tratar pois o erro
	 * dessa vez foi um NullPointer e não temos tratamento para ele apenas para o
	 * ArithmeticException
	 * A solução nesse caso poderia ser:
	 * colocar um catch para cada exceção
	 * try{código}catch(ArithmeticException ex){}catch(NullPointerException ex){}
	 * ou juntarmos as duas no mesmo catch
	 * try{}catch(ArithmeticException | NullPointerException ex){}
	 * outra solução comum é usar o polimorfismo e colocar a referencia do tipo
	 * Exception que é mais genérico
	 */

}
