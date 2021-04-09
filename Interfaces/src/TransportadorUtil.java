
public class TransportadorUtil {

	// Note que assim como heran�a � poss�vel utilizar o polimorfismo e receber uma
	// iterface
	// no m�todo visto que as classes s�o obrigadas a ter esse m�todo (a menos que
	// sejam
	// abstratas mas nesse caso n�o podem dar new e n�o seriam um problema)
	public void transportadorEscolhido(Transportador transportador) {
		transportador.bemVindo();
	}

}
