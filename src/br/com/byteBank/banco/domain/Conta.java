package br.com.byteBank.banco.domain;

/**
 * Clase que representa a moldura de uma conta.
 * 
 * @author Vinicius Lira
 * @version 0.1
 */

public abstract class Conta {

	// Attributes
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// Constructor
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	// Methods
	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoException {
		if (this.saldo < valor) {
			throw new SaldoException("Valor Incorreto. Saldo: $" + this.saldo + ", Valor: $" + valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int novaAgencia) {
		if (novaAgencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		} else {
			this.agencia = novaAgencia;
		}

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (novoNumero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		} else {
			this.numero = novoNumero;
		}

	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente novoCliente) {
		this.titular = novoCliente;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return " nº: " + this.getNumero();
	}

	@Override
	public boolean equals(Object ref) {

		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		} else {
			return true;
		}
	}

}
