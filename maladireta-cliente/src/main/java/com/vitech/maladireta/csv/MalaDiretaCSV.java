package com.vitech.maladireta.csv;

import com.vitech.maladireta.MalaDireta;
import com.vitech.repository.Contatos;

public class MalaDiretaCSV extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaCSV(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

}
