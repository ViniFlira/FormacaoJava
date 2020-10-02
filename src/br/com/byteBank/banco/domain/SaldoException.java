package br.com.byteBank.banco.domain;

/**
 * Classe de criacao da nossa excecao expecifica.
 * 
 * @author Vinicius Lira
 * @version 0.1
 */

public class SaldoException extends Exception {

	public SaldoException(String msg) {
		super(msg);
	}

}
