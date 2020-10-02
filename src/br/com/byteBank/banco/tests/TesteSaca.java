package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.Conta;
import br.com.byteBank.banco.domain.ContaCorrente;
import br.com.byteBank.banco.domain.SaldoException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);

		conta.deposita(200);
		try {
			conta.saca(210);
		} catch (SaldoException ex) {
			System.out.println("Ex." + ex.getMessage());
		}

		System.out.println(conta.getSaldo());
	}

}
