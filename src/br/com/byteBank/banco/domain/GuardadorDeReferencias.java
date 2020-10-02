package br.com.byteBank.banco.domain;

public class GuardadorDeReferencias {

	// Attributes
	private Object[] referencias;
	private int posicaoLivre;

	// Constructor
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	// Methods
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
