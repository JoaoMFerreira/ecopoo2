package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.StatusTransicaoEncomenda;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class StatusTransicaoEncomendaDao extends AbstractDao<StatusTransicaoEncomenda, Integer> {

	/**
	 * 
	 */
	public StatusTransicaoEncomendaDao() {
		super(StatusTransicaoEncomenda.class);
	}

}
