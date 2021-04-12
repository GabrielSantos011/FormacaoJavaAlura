package criandoExcecoes;
/*
 * Para criar uma exce��o � importante saber sobre a hierarquia das exce��es, ent�o vamos l�:
 * Temos a classe Throwable onde ficam os m�todos como o getMessage() e printStackTrace()
 * por�m n�o devemos extender ela diretamente pois ela tem uma divis�o, suas duas filhas
 * Error e Exception
 * Falando primeiramente da Error, n�o � de conhecimento de programadores, 
 * ela � de conhecimento da JVM (e para quem programa ela), n�o devemos mexer nela
 * um exemplo de error � o StackOverFlow (erro quando estouramos a mem�ria do java)
 * Agora falando da classe Exception
 * ela tem uma filha RuntimeException porem podemos extender tanto de sua filha quanto dela.
 * ai teremos as op��es checked e unchecked.
 * quando extendemos diretamente de Exception estamos dizendo que a nossa excecao ser� checked,
 * ou seja o compilador dara erro se voc� n�o deixar expl�cito para ele que voc� est� tratando 
 * essa exce��o ou que voc� tem ciencia de que essa exce��o passar� por aquele m�todo
 * J� quando herdamos de RuntimeException o compilador n�o faz essa verifica��o, 
 * n�o importa se voc� dar� ou n�o o throw ou se voc� vai tratar ele.
 * vamos exemplificar: 
 */

//esta ser� uma exce��o checked
public class MinhaExcecao extends Exception {

	// os dois contrutores sendo que um passa a mensagem para o getMessage() - que
	// est� em Throwable;
	public MinhaExcecao() {

	}

	public MinhaExcecao(String msg) {
		super(msg);
	}
}
