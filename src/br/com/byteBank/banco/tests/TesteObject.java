package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.ContaCorrente;
import br.com.byteBank.banco.domain.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(1);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(55, 66);

		System.out.println(cc);
		System.out.println(cp);

		println();

	}

	// Method
	static void println() {
	}

	static void println(String a) {
	}

	static void println(int i) {
	}

	static void println(boolean bol) {
	}

}
