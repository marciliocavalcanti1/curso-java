package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	/**
	 * Uma lista de itens
	 * (Uma compra tem muitos itens, e um item tem uma compra)
	 */
	// Rela��o 1 pra N - Rela��o unidirecional (nesse caso)
	ArrayList<Item> itens = new ArrayList<Item>();
	
}
