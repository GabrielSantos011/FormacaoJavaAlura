package test.br.com.alura.tdd;
//imports sempre org.junit
import org.junit.Assert;
import org.junit.Test;

import main.br.com.alura.tdd.Calculadora;

public class CalculadoraTest {
	
	//agora usando propriamente o JUnit
	//ao invés de um método main, criaremos um método para cada caso com a
	//notação @Test - colocando o mouse em cima conseguimos fazer o import
	//caso não tenha sido feito
	//boa pratica os nomes dos testes longos e explicativos
	
	@Test
	public void somaInteirosPositivos() {
		Calculadora calc = new Calculadora();
		int valor = calc.somarInteiros(3, 7);
		
		//classe que faz a conferencia dos valores
		Assert.assertEquals(10, valor);
	}

}
