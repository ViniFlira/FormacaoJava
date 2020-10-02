package br.com.byteBank.banco.tests;

import br.com.byteBank.banco.domain.Conexao;

public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na Conexão.");
		}

		// -------------------------------------------------------
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro na Conexão.");
//		} finally {
//			con.close();
//		}
	}

}
