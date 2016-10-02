package com.vitech;

import javax.swing.JOptionPane;

import com.vitech.maladireta.MalaDireta;
import com.vitech.maladireta.xml.MalaDiretaXML;

public class NovoClienteCadastrado {
	
	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		
		String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
		
		boolean status = malaDireta.enviarEmail(mensagem);
		
		JOptionPane.showMessageDialog(null, "E-mail enviado: " + status);
	}
}
