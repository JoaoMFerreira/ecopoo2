package br.com.bortoletto.ecommerce.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author Vitor Bortoletto Junior 3 de dez de 2016
 */
public class ProdutoListagemDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3227130293795799422L;

	private Integer id;
	private String nome;
	private BigDecimal preco;
	private String urlImagem;

	public ProdutoListagemDto() {
	}

	public ProdutoListagemDto(Integer id, String nome, BigDecimal preco, String urlImagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.urlImagem = urlImagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

}
