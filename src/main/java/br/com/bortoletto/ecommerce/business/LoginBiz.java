package br.com.bortoletto.ecommerce.business;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.apache.commons.collections4.CollectionUtils;

import br.com.bortoletto.ecommerce.daos.impl.LoginDao;
import br.com.bortoletto.ecommerce.entities.Login;
import br.com.bortoletto.ecommerce.utils.ParameterUtils;

/**
 * 
 * @author Vitor Bortoletto Junior 3 de jun de 2017
 */
@RequestScoped
public class LoginBiz {

	@Inject
	private LoginDao dao;

	/**
	 * Filtra a entidade pelas propriedades nao nulas no objeto passado
	 * 
	 * @param entity
	 * @return
	 */
	public List<Login> findByExample(Login entity) {
		ParameterUtils.validar(entity);
		return dao.findByExample(entity, null, null);
	}

	/**
	 * Valida se o usuario existe e se a senha esta correta
	 * 
	 * @param usuario
	 * @param senha
	 */
	public boolean validarLogin(String usuario, String senha) {
		Login entity = new Login();
		entity.setUsuario(usuario);
		entity.setSenha(senha);
		return CollectionUtils.isNotEmpty(findByExample(entity));
	}

}
