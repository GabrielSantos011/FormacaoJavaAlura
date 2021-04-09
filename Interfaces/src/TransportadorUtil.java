
public class TransportadorUtil {

	// Note que assim como herança é possível utilizar o polimorfismo e receber uma
	// iterface
	// no método visto que as classes são obrigadas a ter esse método (a menos que
	// sejam
	// abstratas mas nesse caso não podem dar new e não seriam um problema)
	public void transportadorEscolhido(Transportador transportador) {
		transportador.bemVindo();
	}

}
