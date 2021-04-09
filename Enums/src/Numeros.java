/*feito para declarar um conjunto de constantes pr� definidas
 * � uma classe normal podendo ter variaveis e m�todos*/

public enum Numeros {
	ZERO(0),UM(1),DOIS(2);//constantes e passando seu valor pelo construtor logo abaixo
	
	private int valor;
	
	private Numeros(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
