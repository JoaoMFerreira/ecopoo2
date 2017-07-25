package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.Login;

/**
 * 
 * @author Vitor Bortoletto Junior 3 de jun de 2017
 */
@RequestScoped
public class LoginDao extends AbstractDao<Login, Integer> {

	public LoginDao() {
		super(Login.class);
	}

}
