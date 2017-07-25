package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class Bacon extends AdicionalDecorator {

	private Pasta pasta;

	public Bacon(Pasta pasta) {
		super();
		this.pasta = pasta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6080729417759348775L;

	@Override
	public BigDecimal calculaPreco() {
		return this.getPreco().add(pasta.calculaPreco());
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return pasta.getDescricao() + ", Bacon";
	}

}
