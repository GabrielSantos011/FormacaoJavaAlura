package tratamentoComFinally.withResources;

public class Teste {

	public static void main(String[] args) {
		
		/*
		 * Este c�digo obtem o mesmo resultado so implementado no pacote simples
		 * mas al�m de uma implementa��o mais moderna (a partir do java 1.7)
		 * ele nos da uma solu��o pois, imagine:
		 * se fosse jogado uma exce��o no construtor, o c�digo daria erro pois chamariamos
		 * no finally uma variavel to tipo conex�o apontando para null, ou seja, NullPointer
		 * para podermos fazer essa implementa��o a classe conexao deve implementar a interface
		 * AutoCloseable que tem um m�todo  - o close.
		 * se der erro na inicializa��o ele n�o dara mais o null pointer pois n�o chamamos mais essa
		 * referencia apontando para null, e se der algum erro ele j� chama o m�todo close
		 * (� como se ele j� chamasse um finnaly com o close, por�m isso n�o nos impede 
		 * de termos um finally)
		 */

		try (Conexao c = new Conexao()){
			c.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Algo deu errado...");
		} finally {
			System.out.println("encerrado");
		}

	}

}
