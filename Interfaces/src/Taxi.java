//Nota��o para implementarmos a interface (poderia ser mais de uma)
public class Taxi implements Transportador {

	String nome;

	// m�todo implementado
	@Override
	public void bemVindo() {
		System.out.println("Obrigado por escolher o Taxi!");

	}

	@Override
	public void transportar() {
		System.out.println("Estamos a caminho do destino");

	}

	// note que n�o fomos obrigados a implementar o m�todo cobrar pois ele
	// j� � concreto, por�m nada nos impede de sobre escrevermos ele.
	// � importante notar tamb�m que podemos ter m�todos al�m dos da interface
	// at� mesmo pq podemos ter qntas interfaces quisermos implementadas na classe

	public void velocidade() {
		System.out.println("Estamos a 80 km/h");
	}

}
