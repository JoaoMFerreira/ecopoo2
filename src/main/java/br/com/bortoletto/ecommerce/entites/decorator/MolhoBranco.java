package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class MolhoBranco extends AdicionalDecorator {

	private Pasta pasta;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8698134938117832768L;

	public MolhoBranco(Pasta pasta) {
		this.pasta = pasta;
	}

	@Override
	public BigDecimal calculaPreco() {
		return this.getPreco().add(pasta.calculaPreco());
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return pasta.getDescricao() + ", Molho Branco";
	}

}
