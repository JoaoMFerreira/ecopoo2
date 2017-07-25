package br.com.bortoletto.ecommerce.entities;

import java.util.Iterator;

public class AdicionalIterator implements Iterator<String> {

	private String[] adicionaisSelecionados;
	int posicao = 0;

	public AdicionalIterator(String[] adicionaisSelecionados) {
		super();
		this.adicionaisSelecionados = adicionaisSelecionados;
	}

	@Override
	public boolean hasNext() {
		if (posicao >= adicionaisSelecionados.length || adicionaisSelecionados[posicao] == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public String next() {
		String item = adicionaisSelecionados[posicao];
		posicao = posicao + 1;
		return item;
	}

}
