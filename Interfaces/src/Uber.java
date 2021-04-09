//explicações na classe taxi
public class Uber implements Transportador {

	@Override
	public void bemVindo() {
		System.out.println("Obrigado por escolher a Uber!");

	}

	@Override
	public void transportar() {
		System.out.println("Estamos chegando");

	}

}
