/**
 * 
 * @author gabriel
 *@version 1.0
 */
public class Teste {

	/**
	 * isto � uma documenta��o chamada javadoc -documenta��o de devs para devs
	 * o ideal � que acima de todos os m�todos  publicos (somente os publicos)
	 * assim podemos ir em project selecionar o progeto e mandar ele gerar nosso javadoc
	 * uma pagina html com as informa��es
	 * no javadoc temos algumas informa��es por nota��o como
	 * @author Gabriel
	 */
	public static void main(String[] args) { // este � o m�todo onde a aplica��o se inicia
		/*
		 * coment�rio longo
		 */
		// delara��o de v�riavel
		boolean booleano;
		int numeroInteiro;
		long numeroInteiroGrande = 10000000000l;
		double numeroPontoFlutuanteMuitaPrecisao;
		float numeroPontoFlutuantePoucaPrecisao = 11.0001f;
		byte menorNumeroInteiro = 127; // valor maximo
		short numeroInteiroPequeno = 32767; // valor maximo
		char caracter = 'a'; // um caracter

		/*
		 * as variaveis acima s�o os tipos primitivos do java - elas podem ser apenas
		 * declaradas ou declaradas e populadas. Fato � que estas variaveis n�o tem
		 * valor padr�o e devem ser inicializadas antes de resem usadas.
		 */

		// h� ainda String para texto por�m ele n�o � um tipo primitivo
		String texto = "Este � um texto";

		// condicional
		int idade = 18;
		if (idade >= 18) { // a condi��o pode ser uma variavel ou uma express�o booleana
			System.out.println("Voc� j� � maior de idade");
			// apenas por conecimento se eu criar uma v�riavel aqui dentro ela tem o escopo
			// apenas do if
			// em um contexto geral as variaveis duram de um { at� }
		} else { // else if em caso de cadeias de if
			System.out.println("Voc� � menor de idade");
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

		// la�os de repeti��o
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
