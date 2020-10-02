package br.com.byteBank.banco.domain;

public class Conexao implements AutoCloseable {

	// Constructor
	public Conexao() {
		System.out.println("Abrindo Conexão...");
	}

	// Methods
	public void leDados() {
		System.out.println("Recebendo Dados...");
		throw new IllegalStateException();
	}

	@Override
	public void close(){
		System.out.println("Fechando Conexão...");
	}

}
