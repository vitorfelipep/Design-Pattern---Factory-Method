package com.vitech;

import javax.swing.JOptionPane;

import com.vitech.maladireta.MalaDireta;
import com.vitech.maladireta.csv.MalaDiretaCSV;

public class RelacionamentoCliente {
	
	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
		String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
		
		boolean status = malaDireta.enviarEmail(mensagem);
		
		JOptionPane.showConfirmDialog(null, "E-mail enviado: " + status);
				
	}
}
