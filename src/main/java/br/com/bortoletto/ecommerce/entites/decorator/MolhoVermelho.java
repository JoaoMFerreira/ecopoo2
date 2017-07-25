package br.com.bortoletto.ecommerce.entites.decorator;

import java.math.BigDecimal;

public class MolhoVermelho extends AdicionalDecorator {

	private Pasta pasta;
	/**
	 * 
	 */
	private static final long serialVersionUID = -8132067104341659034L;

	public MolhoVermelho(Pasta pasta) {
		this.pasta = pasta;
	}

	@Override
	public BigDecimal calculaPreco() {
		return this.getPreco().add(pasta.calculaPreco());
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return pasta.getDescricao() + ", Molho Vermelho";
	}

}
