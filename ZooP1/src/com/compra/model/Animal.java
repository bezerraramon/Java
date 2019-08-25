package com.compra.model;

import javax.swing.JOptionPane;

public class Animal {

	private String nome;
	private String classe;

	public Animal ( String nome, double idade1) {
		this.nome = nome;
		this.classe = classe;
	}

	public void imprimeInformacoes() {
		String info = String.format("Nome: %s%nClasse:", nome,classe);
		JOptionPane.showMessageDialog(null, info);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}


}
