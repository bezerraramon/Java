package com.compra.model;

import javax.swing.JOptionPane;

public class Reptil extends Animal{

	private String F_M;
		
	public Reptil (String nome, double idade1, String sexo) {
		super(nome, idade1);
		F_M = sexo;
	}
	
	
	public void imprimeInformacoes() {
		String info = String.format("Nome: %s%nClasse: %s%nSexo: %s%%", this.getNome(),this.getClasse(), F_M);
		JOptionPane.showMessageDialog(null, info);
	}
	
	public void imprimeInformacoes(int idade) {
		String info = "";
		if(idade > 18) {
			 info = String.format("Nome: %s%nPreço de Venda: R$ %.2f%nTeor Alcóolico: %.1f%%", this.getNome(),this.getClasse(), F_M);
		}else {
			 info = String.format("Você ainda não pode comprar este produto, aguarde mais %d anos.",18-idade);
		}
		
		JOptionPane.showMessageDialog(null, info);
	}
	
	
	
	
}
