package br.com.byteBank.banco.domain;

public class ContaPoupanca extends Conta {

	// Constructor
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	// Methods
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta Poupança" + super.toString();
	}

}
