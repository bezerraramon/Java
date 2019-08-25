package com.compra.model;

import javax.swing.JOptionPane;

public class Filme {

	private String nome;
	private double preco;

	public Filme ( String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void imprimeInformacoes() {
		String info = String.format("Nome: %s%nPreço de Venda: R$ %.2f", nome,preco);
		JOptionPane.showMessageDialog(null, info);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



}
