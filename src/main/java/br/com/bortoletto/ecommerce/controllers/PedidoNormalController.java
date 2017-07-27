package br.com.bortoletto.ecommerce.controllers;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.bortoletto.ecommerce.business.ProdutoBiz;
import br.com.bortoletto.ecommerce.entites.decorator.Pasta;
import br.com.bortoletto.ecommerce.entities.AdicionalIterator;

@Named
@ViewScoped
public class PedidoNormalController extends PedidoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProdutoBiz produtoBiz;

	private List<Pasta> massas;

	private List<String> adicionais;

	private String[] adicionaisSelecionados;

	private Pasta massaSelecionada;

	@PostConstruct
	public void init() {
		produtoBiz = new ProdutoBiz();
		setMassas(produtoBiz.buscaMassaMock());
		setAdicionais(produtoBiz.mockAdicionais());

	}

	public void escolherMassa() {

	}

	public Pasta getMassaSelecionada() {
		return massaSelecionada;
	}

	public void setMassaSelecionada(Pasta massaSelecionada) {
		this.massaSelecionada = massaSelecionada;
	}

	public List<Pasta> getMassas() {
		return massas;
	}

	public void setMassas(List<Pasta> massas) {
		this.massas = massas;
	}

	public List<String> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(List<String> adicionais) {
		this.adicionais = adicionais;
	}

	public String[] getAdicionaisSelecionados() {
		return adicionaisSelecionados;
	}

	public void setAdicionaisSelecionados(String[] adicionaisSelecionados) {
		this.adicionaisSelecionados = adicionaisSelecionados;
	}

	public Iterator<String> criarIterator() {
		return new AdicionalIterator(getAdicionaisSelecionados());
	}

	@Override
	protected void calcularDesconto() {
		System.out.println("Teste");
	}

}
