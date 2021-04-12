package criandoExcecoes;
/*
 * Para criar uma exceção é importante saber sobre a hierarquia das exceções, então vamos lá:
 * Temos a classe Throwable onde ficam os métodos como o getMessage() e printStackTrace()
 * porém não devemos extender ela diretamente pois ela tem uma divisão, suas duas filhas
 * Error e Exception
 * Falando primeiramente da Error, não é de conhecimento de programadores, 
 * ela é de conhecimento da JVM (e para quem programa ela), não devemos mexer nela
 * um exemplo de error é o StackOverFlow (erro quando estouramos a memória do java)
 * Agora falando da classe Exception
 * ela tem uma filha RuntimeException porem podemos extender tanto de sua filha quanto dela.
 * ai teremos as opções checked e unchecked.
 * quando extendemos diretamente de Exception estamos dizendo que a nossa excecao será checked,
 * ou seja o compilador dara erro se você não deixar explícito para ele que você está tratando 
 * essa exceção ou que você tem ciencia de que essa exceção passará por aquele método
 * Já quando herdamos de RuntimeException o compilador não faz essa verificação, 
 * não importa se você dará ou não o throw ou se você vai tratar ele.
 * vamos exemplificar: 
 */

//esta será uma exceção checked
public class MinhaExcecao extends Exception {

	// os dois contrutores sendo que um passa a mensagem para o getMessage() - que
	// está em Throwable;
	public MinhaExcecao() {

	}

	public MinhaExcecao(String msg) {
		super(msg);
	}
}
