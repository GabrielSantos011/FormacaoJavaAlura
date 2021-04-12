package criandoExcecoes;

//esta será uma exceção unhecked
public class MinhaExcecao2 extends RuntimeException {

	// os dois contrutores sendo que um passa a mensagem para o getMessage() - que
	// está em Throwable;
	public MinhaExcecao2() {

	}

	public MinhaExcecao2(String msg) {
		super(msg);
	}
}
