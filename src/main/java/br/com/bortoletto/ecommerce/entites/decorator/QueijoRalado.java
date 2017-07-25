package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class QueijoRalado extends AdicionalDecorator {

	private Pasta pasta;

	public QueijoRalado(Pasta pasta) {
		super();
		this.pasta = pasta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public BigDecimal calculaPreco() {
		return this.getPreco().add(pasta.calculaPreco());
	}

	@Override
	public String getDescricao() {

		return pasta.getDescricao() + ", Queijo Ralado";
	}

}
