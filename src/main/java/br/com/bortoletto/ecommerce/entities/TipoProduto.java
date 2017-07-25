package br.com.bortoletto.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TipoProduto generated by hbm2java
 */
@Entity
@Table(name = "tipo_produto", schema= "pizzaria")
public class TipoProduto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7662914039113324250L;
	private Integer id;
	private String nomeTipoProduto;

	public TipoProduto() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nome_tipo_produto", nullable = false, length = 50)
	public String getNomeTipoProduto() {
		return this.nomeTipoProduto;
	}

	public void setNomeTipoProduto(String nomeTipoProduto) {
		this.nomeTipoProduto = nomeTipoProduto;
	}

}