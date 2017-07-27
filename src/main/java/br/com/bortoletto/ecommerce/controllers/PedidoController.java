package br.com.bortoletto.ecommerce.controllers;

public abstract class PedidoController {

	public void adicionarProdutoCarrinho() {
		calcularDesconto();
	}

	protected abstract void calcularDesconto();

}
