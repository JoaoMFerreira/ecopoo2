package br.com.bortoletto.ecommerce.controllers;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PedidoLoucoController extends PedidoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4437878889844476799L;

	@Override
	protected void calcularDesconto() {
		System.out.println("Teste");
	}

}
