package tratamentoComFinally.simples;

public class Teste {
	
	public static void main(String args[]) {
		
		/*
		 * vamos exemplificar uma conex�o com oq sabemos at� agora fariamos um try
		 * catch, por�m no caso de ocorrer um erro a aplica��o seria interrompida e a
		 * conex�o continuaria aberta. n�o � isso que queremos se conseguirmos ler ou
		 * n�o, precisamos fechar a conex�o e o finally est� ali para isso � algo que
		 * vai acontecer, ou ap�s o try ou ap�s o catch
		 */
		Conexao c = null;

		try{
			c = new Conexao();
			c.leDados();
			//caso o comando de fechar estivesse aqui n�o daria certo
			//pois estamos jogando a exce��o na linha acima ent�o essa linha n seria lida
			//repetir c�digo n�o � bom e por isso o finally
		} catch(IllegalStateException ex) {
			System.out.println("Algo deu errado...");
		} finally {
			c.fechar();
		}
		
		/*
		 * � importante dizer que antes tinhamos onde tendo um try eramos 
		 * obrigados a ter um catch, agora temos a op��o de ou catch ou catche e finally 
		 * ou somente finally
		 * esta �ltima significa o seguinte, n�o quero tratar o erro, mas caso ele aconte�a
		 * feche a conex�o (exemplo)  
		 */

	}
}
