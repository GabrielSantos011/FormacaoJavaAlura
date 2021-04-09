
public class Teste {

	public static void main(String[] args) {
		Uber uber = new Uber();
		uber.bemVindo();
		uber.transportar();
		uber.cobrar();

		System.out.println("-----------------");

		Taxi taxi = new Taxi();
		taxi.bemVindo();
		taxi.transportar();
		taxi.cobrar();

		System.out.println("-----------------");

		Transportador t1 = new Taxi();
		t1.bemVindo();

		System.out.println("-----------------");

		Transportador t2 = new Uber();
		t2.bemVindo();

		System.out.println("-----------------");

		TransportadorUtil tu = new TransportadorUtil();
		tu.transportadorEscolhido(taxi);
	}

}
