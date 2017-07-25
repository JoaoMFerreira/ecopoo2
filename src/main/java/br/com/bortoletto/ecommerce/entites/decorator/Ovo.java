package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class Ovo extends AdicionalDecorator {

	private Pasta pasta;

	public Ovo(Pasta pasta) {
		super();
		this.pasta = pasta;
	}

	/**
	 * 
	 */

	private static final long serialVersionUID = 3592827778206140445L;

	@Override
	public BigDecimal calculaPreco() {
		return this.getPreco().add(pasta.calculaPreco());
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return pasta.getDescricao() + ", Ovo";
	}

}
