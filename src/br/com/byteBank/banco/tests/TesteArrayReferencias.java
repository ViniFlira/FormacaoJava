package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.Cliente;
import br.com.byteBank.banco.domain.ContaCorrente;
import br.com.byteBank.banco.domain.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaPoupanca cp1 = new ContaPoupanca(111, 111);
		referencias[0] = cp1;

		ContaCorrente cc2 = new ContaCorrente(222, 222);
		referencias[1] = cc2;

		ContaCorrente ref = (ContaCorrente) referencias[1]; // Type cast.

		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());

		Cliente cliente = new Cliente();
		referencias[2] = cliente;

	}

}
