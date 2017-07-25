package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class Cebolinha extends AdicionalDecorator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7543871627475260218L;

	private Pasta pasta;

	public Cebolinha(Pasta pasta) {
		this.pasta = pasta;
	}

	@Override
	public BigDecimal calculaPreco() {
		// TODO Auto-generated method stub
		return this.getPreco().add(pasta.calculaPreco());
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return pasta.getDescricao() + ", Cebolinha";
	}

}
