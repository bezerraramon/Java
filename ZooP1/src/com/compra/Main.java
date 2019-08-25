package com.compra;

import javax.swing.JOptionPane;
import com.compra.model.Animal;
import com.compra.model.Reptil;
import com.compra.model.Mamifero;
import com.compra.util.Relatorios;

public class Main {

	public static void main(String[] args) {
		Animal listaDeAnimais[]= null;

		int idade, qtdBebidas;
		String aux, aux1, aux2, sexo = null;
		boolean auxValid = false;
		int classeAnimal, escolha;
		double idade1, caloria;
		int resposta;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao cadastro de animais de nosso Zoologico! ");
		resposta = JOptionPane.showConfirmDialog(null, "Vamos começar?");
		if (resposta == JOptionPane.YES_OPTION) { 
			} else { System.exit(0);}
		
		do {
			try {


				aux = JOptionPane.showInputDialog("Quantos animais deseja cadastrar?");
				if(aux == null) System.exit(0);
				qtdBebidas = Integer.parseInt(aux);
				if(qtdBebidas > 0)
					listaDeAnimais = new Animal[qtdBebidas];
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


		for(int i=0;i< listaDeAnimais.length ;i++) {
			aux = JOptionPane.showInputDialog(null, String.format("Animal %d%nClasse do animal%n 1 - Mamifero%n2 - Reptil%n3 - Ave",i));
			if(aux == null) System.exit(0);
			try {
				classeAnimal = Integer.parseInt(aux);
				if(classeAnimal < 1 || classeAnimal > 3)
					throw new IllegalArgumentException();

				aux = JOptionPane.showInputDialog(null, "Nome:");
				if(aux == null) System.exit(0);
				aux2 = JOptionPane.showInputDialog(null, "Idade:");
				if(aux2 == null) System.exit(0);
				idade1 = Double.parseDouble(aux2);
				if(classeAnimal == 1) {
					aux1 = JOptionPane.showInputDialog(null, "Sexo:");
					if(aux1 == null) System.exit(0);
					
					listaDeAnimais[i] = new Reptil(aux,idade1,sexo);
				}else if(classeAnimal == 2){
					aux1 = JOptionPane.showInputDialog(null, "Calorias:");
					if(aux1 == null) System.exit(0);
					caloria = Double.parseDouble(aux1);
					listaDeAnimais[i] = new Mamifero(aux,idade1,caloria);
				}else {
					listaDeAnimais[i] = new Animal(aux,idade1);
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
				aux = Relatorios.retornaArrayBebida(listaDeAnimais);
				aux= JOptionPane.showInputDialog("O que deseja comprar?\n"+aux);
				if(aux == null) auxiliar = false;
				else {
					escolha = Integer.parseInt(aux);
					
					if(escolha < 0 || escolha >= listaDeAnimais.length)
						throw new NumberFormatException();
					
					Animal b = listaDeAnimais[escolha];
					if(b instanceof Mamifero) {
						Mamifero bna = (Mamifero) b;
						bna.imprimeInformacoes();
					}else if( b instanceof Reptil){
						Reptil ba = (Reptil) b;
						idade1 = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
						if(idade1 > 18) ba.imprimeInformacoes();
						//else ba.imprimeInformacoes(idade1);
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
