package br.com.byteBank.banco.domain;

public class ContaCorrente extends Conta implements Tributavel {

	// Constructor
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	// Methods
	@Override
	public void saca(double valor) throws SaldoException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente" + super.toString();
	}

}
