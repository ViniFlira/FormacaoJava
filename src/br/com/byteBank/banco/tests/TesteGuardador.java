package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.Conta;
import br.com.byteBank.banco.domain.ContaCorrente;
import br.com.byteBank.banco.domain.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();

		Conta cc1 = new ContaCorrente(222, 333);

		guardador.adiciona(cc1);

		Conta cc2 = new ContaCorrente(444, 666);
		
		guardador.adiciona(cc2);

	}

}
