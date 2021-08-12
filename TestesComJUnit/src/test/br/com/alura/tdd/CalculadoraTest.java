package test.br.com.alura.tdd;

import main.br.com.alura.tdd.Calculadora;

public class CalculadoraTest {
	
	public static void main(String args[]) {
		//teste automatizado indemende do JUnit
		//a ideia é conferir se deu um resultado esperado
		//exemplo de teste automatizado
		
		Calculadora calc = new Calculadora();
		int valor;
		
		//os testes devem englobar todos os casos
		
		//teste do método soma de inteiros
		
		//para dois positivos
		valor = calc.somarInteiros(3, 4);
		if (valor == 7)
			System.out.println("soma de dois inteiros está ok");
		else 
			System.out.println("algo de errado na soma de dois inteiros");
		
		//para soma com 0
		valor = calc.somarInteiros(0, 4);
		if (valor == 4)
			System.out.println("soma com 0 está ok");
		else 
			System.out.println("algo de errado na soma com 0");
				
		
		//para dois 0
		valor = calc.somarInteiros(0, 0);
		if (valor == 0)
			System.out.println("soma de dois inteiros está ok");
		else 
			System.out.println("algo de errado na soma de dois inteiros");
		
		//teriamos outros exemplos mas a ideia básica é essa
	}
	
}
