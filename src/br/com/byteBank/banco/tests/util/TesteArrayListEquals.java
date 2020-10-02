package br.com.byteBank.banco.tests.util;

import java.util.ArrayList;

import br.com.byteBank.banco.domain.Conta;
import br.com.byteBank.banco.domain.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		lista.add(cc3);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		boolean igual = cc3.equals(cc2);
		System.out.println("Já Existe: " + igual);

	}

}
