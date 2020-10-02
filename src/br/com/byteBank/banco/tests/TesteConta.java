package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.ContaCorrente;
import br.com.byteBank.banco.domain.ContaPoupanca;
import br.com.byteBank.banco.domain.SaldoException;
import br.com.byteBank.banco.especial.ContaEspecial;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaEspecial ce = new ContaEspecial(003, 194);
		ce.deposita(150);
		System.out.println("CE: " + ce.getSaldo());

		ContaCorrente cc = new ContaCorrente(001, 99);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(002, 58);
		cp.deposita(200.0);

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

		try {
			cc.transfere(10, cp);
		} catch (SaldoException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
