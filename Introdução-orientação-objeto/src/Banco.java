
public class Banco {

	public static void main(String[] args) {

		Conta conta = new Conta(1234, 123456, new Cliente()); // o new ´w oq faz a instancia do objeto
		conta.depositar(100);
		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular()); // isso aqui mostra uma sujeira - como um endereço de memória onde o
		                                        //objeto está guardado
		System.out.println(conta.getTitular().getNome()); // está resultando null pois não forcei o construtor de cliente 
		                                                  // a receber os parametros no construtor
		
		conta.sacar(1000);
		
		//para demonstrar um erro nullpointer
		Conta novaConta = new Conta();
		System.out.println(novaConta.getTitular().getCpf()); // o titular da conta ainda não foi instanciado
		// portanto estou tentando pegar algo que está apontando para null e não para um cliente
		//o correto seria criar uma referencia cliente e atrbuir ela a titular.

	}

}
