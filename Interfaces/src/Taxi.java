//Notação para implementarmos a interface (poderia ser mais de uma)
public class Taxi implements Transportador {

	String nome;

	// método implementado
	@Override
	public void bemVindo() {
		System.out.println("Obrigado por escolher o Taxi!");

	}

	@Override
	public void transportar() {
		System.out.println("Estamos a caminho do destino");

	}

	// note que não fomos obrigados a implementar o método cobrar pois ele
	// já é concreto, porém nada nos impede de sobre escrevermos ele.
	// è importante notar também que podemos ter métodos além dos da interface
	// até mesmo pq podemos ter qntas interfaces quisermos implementadas na classe

	public void velocidade() {
		System.out.println("Estamos a 80 km/h");
	}

}
