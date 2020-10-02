package br.com.byteBank.banco.tests;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Alura"; // Object Literal.
		// String outro = new String("Alura");
		
		char c = 'A';
		char d = 'a';

		String novoNome = nome.replace(c, d);

		String nomeNovo = nome.toLowerCase();

		System.out.println(nome);
		System.out.println(novoNome);
		System.out.println(nomeNovo);

	}

}
