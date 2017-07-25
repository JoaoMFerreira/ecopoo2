package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.TipoProduto;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class TipoProdutoDao extends AbstractDao<TipoProduto, Integer> {

	/**
	 * 
	 */
	public TipoProdutoDao() {
		super(TipoProduto.class);
	}

}
