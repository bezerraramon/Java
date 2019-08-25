package com.compra.model;

import javax.swing.JOptionPane;

public class GeneroTerror extends Filme{

	private double faixa_etaria;
		
	public GeneroTerror (String nome, double preco, double idade) {
		super(nome, preco);
		faixa_etaria = idade;
	}
	
	
	public void imprimeInformacoes() {
		String info = String.format("Nome: %s%nPre�o de Venda: R$ %.2f%nTeor Faixa Et�ria: %.1f%%", this.getNome(),this.getPreco(), faixa_etaria);
		JOptionPane.showMessageDialog(null, info);
	}
	
	public void imprimeInformacoes(int idade) {
		String info = "";
		if(idade > 17) {
			 info = String.format("Nome: %s%nPre�o de Venda: R$ %.2f%nFaixa Et�ria: %.1f%%", this.getNome(),this.getPreco(), faixa_etaria);
		}else {
			 info = String.format("Voc� ainda n�o pode comprar este produto, aguarde mais %d anos.",18-idade);
		}
		
		JOptionPane.showMessageDialog(null, info);
	}
	
	
	
	
}
