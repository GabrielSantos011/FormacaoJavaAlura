
public class Teste {
	public static void main(String []args) {
		System.out.println(Numeros.ZERO.name());
		System.out.println(Numeros.ZERO.compareTo(Numeros.DOIS));
		System.out.println(Numeros.ZERO.ordinal());
		Numeros.DOIS.getValor();
		Numeros n = Numeros.ZERO;// maneira de se instanciar um Enum
		
	}
}
