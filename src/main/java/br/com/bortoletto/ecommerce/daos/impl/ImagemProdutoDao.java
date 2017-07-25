package br.com.bortoletto.ecommerce.daos.impl;

import javax.enterprise.context.RequestScoped;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.entities.ImagemProduto;

/**
 * 
 * @author vbortole
 *
 */
@RequestScoped
public class ImagemProdutoDao extends AbstractDao<ImagemProduto, Integer> {

	/**
	 * 
	 */
	public ImagemProdutoDao() {
		super(ImagemProduto.class);
	}

}
