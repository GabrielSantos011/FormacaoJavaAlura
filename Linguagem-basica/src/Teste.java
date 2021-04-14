/**
 * 
 * @author gabriel
 *@version 1.0
 */
public class Teste {

	/**
	 * isto é uma documentação chamada javadoc -documentação de devs para devs
	 * o ideal é que acima de todos os métodos  publicos (somente os publicos)
	 * assim podemos ir em project selecionar o progeto e mandar ele gerar nosso javadoc
	 * uma pagina html com as informações
	 * no javadoc temos algumas informações por notação como
	 * @author Gabriel
	 */
	public static void main(String[] args) { // este é o método onde a aplicação se inicia
		/*
		 * comentário longo
		 */
		// delaração de váriavel
		boolean booleano;
		int numeroInteiro;
		long numeroInteiroGrande = 10000000000l;
		double numeroPontoFlutuanteMuitaPrecisao;
		float numeroPontoFlutuantePoucaPrecisao = 11.0001f;
		byte menorNumeroInteiro = 127; // valor maximo
		short numeroInteiroPequeno = 32767; // valor maximo
		char caracter = 'a'; // um caracter

		/*
		 * as variaveis acima são os tipos primitivos do java - elas podem ser apenas
		 * declaradas ou declaradas e populadas. Fato é que estas variaveis não tem
		 * valor padrão e devem ser inicializadas antes de resem usadas.
		 */

		// há ainda String para texto porém ele não é um tipo primitivo
		String texto = "Este é um texto";

		// condicional
		int idade = 18;
		if (idade >= 18) { // a condição pode ser uma variavel ou uma expressão booleana
			System.out.println("Você já é maior de idade");
			// apenas por conecimento se eu criar uma váriavel aqui dentro ela tem o escopo
			// apenas do if
			// em um contexto geral as variaveis duram de um { até }
		} else { // else if em caso de cadeias de if
			System.out.println("Você é menor de idade");
		}

		switch (idade) {
		case 17:
			System.out.println("17 anos");
			break;
		case 18:
			System.out.println("18 anos");
			break;
		default:
			System.out.println("Outra idade");
		}

		// laços de repetição
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		int i = 0;
		while (i < 10) {
			System.out.println(i + 1);
			i++;
		}

		i = 0;
		do {
			System.out.println(i + 1);
			i++;
		} while (i < 10);

		// podemos fazer um casting
		double n1 = 1;
		float n2 = (float) n1;

	}

}
