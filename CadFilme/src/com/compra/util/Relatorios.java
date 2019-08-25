package com.compra.util;

import com.compra.model.Filme;

public class Relatorios {

		public static String retornaArrayBebida(Filme[] filmes) {
		String retorno = "";
		for(int i = 0; i< filmes.length;i++) {
			retorno += String.format("%d - Filme: %s %n",i, filmes[i].getNome());
		}
		return retorno;
	}
}
