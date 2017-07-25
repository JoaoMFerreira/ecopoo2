package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.Encomenda;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class EncomendaDao extends AbstractDao<Encomenda, Integer> {

	/**
	 * 
	 */
	public EncomendaDao() {
		super(Encomenda.class);
	}

}
