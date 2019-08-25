package com.compra;

import javax.swing.JOptionPane;
import com.compra.model.Filme;
import com.compra.model.GeneroTerror;
import com.compra.model.GeneroComedia;
import com.compra.util.Relatorios;

public class Main {

	public static void main(String[] args) {
		Filme listaDeFilmes[]= null;

		int idade, qtdFilmes;
		String aux, aux1, aux2;
		boolean auxValid = false;
		int tipoFilme, escolha;
		double valor, faixa_etaria, faixa_etaria2;
		int resposta;
		
		
		do {
			try {


				aux = JOptionPane.showInputDialog("Por favor, digite a quantidade de filmes:");
				if(aux == null) System.exit(0);
				qtdFilmes = Integer.parseInt(aux);
				if(qtdFilmes > 0)
					listaDeFilmes = new Filme[qtdFilmes];
				else
					throw new IllegalArgumentException();

				auxValid = true;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite um número válido");
				auxValid = false;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite um número maior que zero");
				auxValid = false;
			}
		}while(!auxValid);


		for(int i=0;i< listaDeFilmes.length ;i++) {
			aux = JOptionPane.showInputDialog(null, String.format("Filme %d%nGenero do filme%n 1 - Terror%n2 - Comedia%n3 - Infantil",i));
			if(aux == null) System.exit(0);
			try {
				tipoFilme = Integer.parseInt(aux);
				if(tipoFilme < 1 || tipoFilme > 3)
					throw new IllegalArgumentException();

				aux = JOptionPane.showInputDialog(null, "Nome:");
				if(aux == null) System.exit(0);
				aux2 = JOptionPane.showInputDialog(null, "Preço:");
				if(aux2 == null) System.exit(0);
				valor = Double.parseDouble(aux2);
				if(tipoFilme == 1) {
					aux1 = JOptionPane.showInputDialog(null, "Faixa etária:");
					if(aux1 == null) System.exit(0);
					faixa_etaria2 = Double.parseDouble(aux1);
					if(faixa_etaria2 < 18) {}
					else { JOptionPane.showMessageDialog(null, "Opa, você não pode fazer isto"); System.exit(0);}
					listaDeFilmes[i] = new GeneroTerror(aux,valor,faixa_etaria2);
				}else if(tipoFilme == 2){
					aux1 = JOptionPane.showInputDialog(null, "Faixa etária:");
					if(aux1 == null) System.exit(0);
					faixa_etaria = Double.parseDouble(aux1);
					if(faixa_etaria < 18) {}
					else { JOptionPane.showMessageDialog(null, "Opa, você não pode fazer isto"); System.exit(0);}
					listaDeFilmes[i] = new GeneroComedia(aux,valor,faixa_etaria);
				}else {
					listaDeFilmes[i] = new Filme(aux,valor);
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite um número válido");
				i--;

			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				i--;
			}
		}

		boolean auxiliar = true;
		do {
			try {
				aux = Relatorios.retornaArrayBebida(listaDeFilmes);
				aux= JOptionPane.showInputDialog("O que deseja comprar?\n"+aux);
				if(aux == null) auxiliar = false;
				else {
					escolha = Integer.parseInt(aux);
					
					if(escolha < 0 || escolha >= listaDeFilmes.length)
						throw new NumberFormatException();
					
					Filme b = listaDeFilmes[escolha];
					if(b instanceof GeneroComedia) {
						GeneroComedia bna = (GeneroComedia) b;
						bna.imprimeInformacoes();
					}else if( b instanceof GeneroTerror){
						GeneroTerror ba = (GeneroTerror) b;
						idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
						if(idade > 18) ba.imprimeInformacoes();
						else ba.imprimeInformacoes(idade);
					}else {
						b.imprimeInformacoes();
					}
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Escolha inválida. Tente outra vez.");
			}


		}while(auxiliar);




	}



}
