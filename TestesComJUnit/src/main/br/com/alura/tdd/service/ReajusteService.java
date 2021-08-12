package main.br.com.alura.tdd.service;

import java.math.BigDecimal;

import main.br.com.alura.tdd.modelo.Desempenho;
import main.br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario,
			Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		funcionario.reajustarSalario(percentual);
	}

}




