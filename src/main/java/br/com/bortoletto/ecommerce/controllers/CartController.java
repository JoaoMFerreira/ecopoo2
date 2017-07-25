package br.com.bortoletto.ecommerce.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import br.com.bortoletto.ecommerce.entities.Produto;

@Named
@SessionScoped
public class CartController {

	private List<Produto> carrinho = new ArrayList<>();

	/**
	 * @return the carrinho
	 */
	public List<Produto> getCarrinho() {
		return carrinho;
	}

	/**
	 * @param carrinho
	 *            the carrinho to set
	 */
	public void setCarrinho(List<Produto> carrinho) {
		this.carrinho = carrinho;
	}

}
