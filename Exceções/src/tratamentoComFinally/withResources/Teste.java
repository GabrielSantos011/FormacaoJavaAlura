package tratamentoComFinally.withResources;

public class Teste {

	public static void main(String[] args) {
		
		/*
		 * Este código obtem o mesmo resultado so implementado no pacote simples
		 * mas além de uma implementação mais moderna (a partir do java 1.7)
		 * ele nos da uma solução pois, imagine:
		 * se fosse jogado uma exceção no construtor, o código daria erro pois chamariamos
		 * no finally uma variavel to tipo conexão apontando para null, ou seja, NullPointer
		 * para podermos fazer essa implementação a classe conexao deve implementar a interface
		 * AutoCloseable que tem um método  - o close.
		 * se der erro na inicialização ele não dara mais o null pointer pois não chamamos mais essa
		 * referencia apontando para null, e se der algum erro ele já chama o método close
		 * (é como se ele já chamasse um finnaly com o close, porém isso não nos impede 
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
