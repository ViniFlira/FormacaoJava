package br.com.byteBank.banco.domain;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
