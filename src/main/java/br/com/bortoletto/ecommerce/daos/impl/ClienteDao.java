package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.Cliente;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class ClienteDao extends AbstractDao<Cliente, Integer> {

	/**
	 * 
	 */
	public ClienteDao() {
		super(Cliente.class);
	}

}
