package br.com.alura.aula.object;

public class Teste {

	public static void main(String args[]) {
		Conta c = new Conta();
		System.out.println(c); // ao inv�s de vir uma posi��o de memoria vir� 
		// "Esta � a classe conta" pois sobreescrevemos o toString de object
	}
	
	//pode ser interessante sobreescrever o equals() pois o contains() em uma lista chama este m�todo e o hashCode()
}
