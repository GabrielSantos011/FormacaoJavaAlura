package criandoExcecoes;

//esta ser� uma exce��o unhecked
public class MinhaExcecao2 extends RuntimeException {

	// os dois contrutores sendo que um passa a mensagem para o getMessage() - que
	// est� em Throwable;
	public MinhaExcecao2() {

	}

	public MinhaExcecao2(String msg) {
		super(msg);
	}
}
