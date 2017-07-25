package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.FormaPagamento;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class FormaPagamentoDao extends AbstractDao<FormaPagamento, Integer> {

	/**
	 * 
	 */
	public FormaPagamentoDao() {
		super(FormaPagamento.class);
	}

}
