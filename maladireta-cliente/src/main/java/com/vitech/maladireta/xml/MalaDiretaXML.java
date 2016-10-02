package com.vitech.maladireta.xml;

import com.vitech.maladireta.MalaDireta;
import com.vitech.repository.Contatos;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}

}
