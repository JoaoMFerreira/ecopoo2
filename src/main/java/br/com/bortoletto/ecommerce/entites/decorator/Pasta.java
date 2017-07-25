package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

import br.com.bortoletto.ecommerce.entities.Produto;

public abstract class Pasta extends Produto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract BigDecimal calculaPreco();

}
