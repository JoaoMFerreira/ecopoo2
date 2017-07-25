package br.com.bortoletto.ecommerce.business;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bortoletto.ecommerce.daos.impl.ProdutoDao;
import br.com.bortoletto.ecommerce.entites.decorator.MacarraoGravata;
import br.com.bortoletto.ecommerce.entites.decorator.MacarraoParafuso;
import br.com.bortoletto.ecommerce.entites.decorator.MacarraoPenne;
import br.com.bortoletto.ecommerce.entites.decorator.Pasta;
import br.com.bortoletto.ecommerce.entities.Produto;

/**
 * 
 * @author Vitor Bortoletto Junior 3 de dez de 2016
 */
@RequestScoped
public class ProdutoBiz {

	private static final Logger LOGGER = LogManager.getLogger();

	private ProdutoDao produtoDao;

	public ProdutoBiz() {
		super();
		this.produtoDao = new ProdutoDao();
	}

	public Produto buscaMassa() {
		LOGGER.info("");
		return produtoDao.findByTipoProduto();
	}

	public List<Pasta> buscaMassaMock() {
		List<Pasta> hash = new ArrayList<>();
		MacarraoGravata macarraoGravata = new MacarraoGravata();
		macarraoGravata.setNome("gravata");
		macarraoGravata.setDescricao("Macarrão Gravata");
		MacarraoPenne macarraoPenne = new MacarraoPenne();
		macarraoPenne.setNome("penne");
		MacarraoParafuso macarraoParafuso = new MacarraoParafuso();
		macarraoParafuso.setNome("parafuso");

		hash.add(macarraoGravata);
		hash.add(macarraoPenne);
		hash.add(macarraoParafuso);

		return hash;
	}

	public List<String> mockAdicionais() {
		List<String> adicionais = new ArrayList<>();
		adicionais.add("Bacon");
		adicionais.add("Cebolinha");
		adicionais.add("Ovo");
		adicionais.add("QueijoRalado");
		adicionais.add("Molho Branco");
		adicionais.add("Molho Vermelho");

		return adicionais;
	}

}
