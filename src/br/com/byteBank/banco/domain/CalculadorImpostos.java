package br.com.byteBank.banco.domain;

public class CalculadorImpostos {
	
	// Attributes	
	private double totalImposto;
	
	// Methods
	public void registro(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
