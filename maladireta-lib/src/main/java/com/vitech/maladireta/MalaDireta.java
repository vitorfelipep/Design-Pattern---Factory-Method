package com.vitech.maladireta;

import java.util.List;

import com.vitech.model.Contato;
import com.vitech.repository.Contatos;

public abstract class MalaDireta {
	
	protected abstract Contatos criarContatos();
	
	public boolean enviarEmail(String mensagem) {
		List<Contato> contatos = criarContatos().todos();
		
		System.out.println("Conectando no servidor SMTP...");
		System.out.println("Mensagem a ser enviada: " + mensagem);
		System.out.println();
		
		for (Contato contato : contatos) {
			System.out.println("From: <contato@algaworks.com>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}
		
		return true;
	}
}
