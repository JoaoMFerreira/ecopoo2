package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.Endereco;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class EnderecoDao extends AbstractDao<Endereco, Integer> {

	/**
	 * 
	 */
	public EnderecoDao() {
		super(Endereco.class);
	}

}
