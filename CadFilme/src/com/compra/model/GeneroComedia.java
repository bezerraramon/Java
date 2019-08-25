package com.compra.model;

import javax.swing.JOptionPane;

public class GeneroComedia extends Filme {
	
	private double faixa_etaria;
	
	public GeneroComedia (String nome, double preco, double idade) {
		super(nome, preco);
		this.faixa_etaria = idade;
	}
	
	public void imprimeInformacoes() {
		String info = String.format("Nome: %s%nPreço de Venda: R$ %.2f%nCalorias: %.3fkcal", this.getNome(),this.getPreco(), faixa_etaria);
		JOptionPane.showMessageDialog(null, info);
	}
	
}
