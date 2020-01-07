package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	/**
	 * Uma lista de itens
	 * (Uma compra tem muitos itens, e um item tem uma compra)
	 */
	// Relação 1 pra N - Relação unidirecional (nesse caso)
	ArrayList<Item> itens = new ArrayList<Item>();
	
}
