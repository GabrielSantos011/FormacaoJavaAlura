package test.br.com.alura.tdd.service;

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
		BigDecimal bonus = service.calcularBonus(new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("12000")));
		
		Assert.assertEquals(new BigDecimal("0.00"), bonus);
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
