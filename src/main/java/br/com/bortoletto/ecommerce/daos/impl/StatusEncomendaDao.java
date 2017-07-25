package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.StatusEncomenda;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class StatusEncomendaDao extends AbstractDao<StatusEncomenda, Integer> {

	/**
	 * 
	 */
	public StatusEncomendaDao() {
		super(StatusEncomenda.class);
	}

}
