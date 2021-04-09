/*
 * uma interface é uma classe abstrata (não precisamos colocar abstract
 * antes da interface pois já é padrão)
 * como no Java não é possível implementar herança multipla
 * usamos interfaces como uma maneira de garantir que certas classes 
 * tenham determinados métodos
 * funcionam como um contrato e diferente da herança podemos ter várias interfaces*/
public interface Transportador {

	String teste = ""; // nos javas mais recentes podemos ter variaveis final em interfaces

	void bemVindo();

	void transportar(); // neste método já está implicito que
						// ele é public(unico modificador de acesso
						// permitido) e abstract
	// nos javas mais recentes podemos ter métodos concretos através do default

	default void cobrar() {
		System.out.println("Chegamos, qual é a forma de pagamento");
	}

}
