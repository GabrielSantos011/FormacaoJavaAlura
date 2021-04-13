package tratamentoComFinally.simples;

public class Teste {
	
	public static void main(String args[]) {
		
		/*
		 * vamos exemplificar uma conexão com oq sabemos até agora fariamos um try
		 * catch, porém no caso de ocorrer um erro a aplicação seria interrompida e a
		 * conexão continuaria aberta. não é isso que queremos se conseguirmos ler ou
		 * não, precisamos fechar a conexão e o finally está ali para isso é algo que
		 * vai acontecer, ou após o try ou após o catch
		 */
		Conexao c = null;

		try{
			c = new Conexao();
			c.leDados();
			//caso o comando de fechar estivesse aqui não daria certo
			//pois estamos jogando a exceção na linha acima então essa linha n seria lida
			//repetir código não é bom e por isso o finally
		} catch(IllegalStateException ex) {
			System.out.println("Algo deu errado...");
		} finally {
			c.fechar();
		}
		
		/*
		 * é importante dizer que antes tinhamos onde tendo um try eramos 
		 * obrigados a ter um catch, agora temos a opção de ou catch ou catche e finally 
		 * ou somente finally
		 * esta última significa o seguinte, não quero tratar o erro, mas caso ele aconteça
		 * feche a conexão (exemplo)  
		 */

	}
}
