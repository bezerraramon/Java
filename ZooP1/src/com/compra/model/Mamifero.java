package com.compra.model;

import javax.swing.JOptionPane;

public class Mamifero extends Animal {
	
	private double calorias;
	
	public Mamifero (String nome, double preco, double calorias) {
		super(nome, preco);
		this.calorias = calorias;
	}
	
	public void imprimeInformacoes() {
		String info = String.format("Nome: %s%nPreço de Venda: R$ %.2f%nCalorias: %.3fkcal", this.getNome(),this.getPreco(), calorias);
		JOptionPane.showMessageDialog(null, info);
	}
	
}
