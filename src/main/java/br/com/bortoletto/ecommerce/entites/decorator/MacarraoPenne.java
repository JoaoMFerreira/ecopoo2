package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class MacarraoPenne extends Pasta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3964064563265240509L;

	@Override
	public BigDecimal calculaPreco() {
		return this.getPreco();
	}

}
