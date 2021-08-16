package test.br.com.alura.tdd.service;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import main.br.com.alura.tdd.modelo.Funcionario;
import main.br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {
	
	@Test
	public void calcularBonusParaSalarioMaiorQueDezMil() {
		BonusService service = new BonusService();
		
		//primeira forma de testar métodos que retornam exception
		//passamos o .class da exception esperada e um lambda do médtodo que joga a exception
		
		//assertThrows(IllegalArgumentException.class, 
		//() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
	
		//segunda forma, colocamos um try{}catch{}
		//chamamos o método e o esperado é a exception e portanto caia no catch
		//caso ele não vá para o catch jogamos um fail pois o comportamento está errado
		//no catch podemos deixar vazio ou se tivermos validações podemos colocar
		//neste caso estamos validando a mensagem do erro
		
		try {
			service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
			fail("nao deu exception");
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("Funcionario com salario maior do que R$1000 nao pode receber bonus!", e.getMessage());
		}
	}
	
	@Test
	public void calcularBonusParaSalarioIgualADezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("10000")));
		
		Assert.assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
	@Test
	public void calcularBonusParaSalarioMenorQueDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("5000")));
		
		Assert.assertEquals(new BigDecimal("500.00"), bonus);
	}

}
