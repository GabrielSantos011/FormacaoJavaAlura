package tratamentoComFinally.simples;

public class Conexao {
	
	public Conexao() {
		System.out.println("Abrindo conexao");
	}

	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException(); //erro que pode ser utilizado j� da biblioteca do java
		//outro conhecido � o IllegalArgumentException
	}
 
	public void fechar() { 
		System.out.println("Fechando conexao");
		
	}

}
