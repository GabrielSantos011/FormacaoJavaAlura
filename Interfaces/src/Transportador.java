/*
 * uma interface � uma classe abstrata (n�o precisamos colocar abstract
 * antes da interface pois j� � padr�o)
 * como no Java n�o � poss�vel implementar heran�a multipla
 * usamos interfaces como uma maneira de garantir que certas classes 
 * tenham determinados m�todos
 * funcionam como um contrato e diferente da heran�a podemos ter v�rias interfaces*/
public interface Transportador {

	String teste = ""; // nos javas mais recentes podemos ter variaveis final em interfaces

	void bemVindo();

	void transportar(); // neste m�todo j� est� implicito que
						// ele � public(unico modificador de acesso
						// permitido) e abstract
	// nos javas mais recentes podemos ter m�todos concretos atrav�s do default

	default void cobrar() {
		System.out.println("Chegamos, qual � a forma de pagamento");
	}

}
