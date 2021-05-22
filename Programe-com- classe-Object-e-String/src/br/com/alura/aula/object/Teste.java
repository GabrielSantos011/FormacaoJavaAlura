package br.com.alura.aula.object;

public class Teste {

	public static void main(String args[]) {
		Conta c = new Conta();
		System.out.println(c); // ao invés de vir uma posição de memoria virá 
		// "Esta é a classe conta" pois sobreescrevemos o toString de object
	}
	
	//pode ser interessante sobreescrever o equals() pois o contains() em uma lista chama este método e o hashCode()
}
