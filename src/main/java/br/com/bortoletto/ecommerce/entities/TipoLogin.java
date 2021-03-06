package br.com.bortoletto.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "tipo_login", schema= "pizzaria")
public class TipoLogin implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8518541143096829146L;
	private Integer id;
	private String nomeTipoLogin;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nome_tipo_login", nullable = false, length = 30)
	public String getNomeTipoLogin() {
		return nomeTipoLogin;
	}

	public void setNomeTipoLogin(String nomeTipoLogin) {
		this.nomeTipoLogin = nomeTipoLogin;
	}

}
