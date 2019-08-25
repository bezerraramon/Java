package com.compra.util;

import com.compra.model.Animal;

public class Relatorios {

		public static String retornaArrayBebida(Animal[] bebidas) {
		String retorno = "";
		for(int i = 0; i< bebidas.length;i++) {
			retorno += String.format("%d - Bebida: %s %n",i, bebidas[i].getNome());
		}
		return retorno;
	}
}
