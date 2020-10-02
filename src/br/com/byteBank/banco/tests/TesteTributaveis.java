package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.CalculadorImpostos;
import br.com.byteBank.banco.domain.ContaCorrente;
import br.com.byteBank.banco.domain.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorImpostos calculador = new CalculadorImpostos();
		calculador.registro(cc);
		calculador.registro(seguro);

		System.out.println(calculador.getTotalImposto());

	}

}