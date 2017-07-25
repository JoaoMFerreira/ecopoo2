package br.com.bortoletto.ecommerce.daos;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author vbortole
 *
 * @param <E>
 *            Entidade
 * @param <I>
 *            Identificador
 */
public interface Dao<E extends Serializable, I extends Serializable> {

	/**
	 * Busca pelo id da entidade
	 * 
	 * @param id
	 * @return
	 */
	E findById(I id);

	/**
	 * Remove a entidade do banco de dados
	 *
	 * @param entity
	 * @return
	 */
	E save(E entity);

	/**
	 * Remove a entidade do banco de dados
	 * 
	 * @param entity
	 */
	void delete(E entity);

	/**
	 * Atualiza a entidade no banco de dados
	 * 
	 * @param entity
	 * @return
	 */
	E update(E entity);

	/**
	 * Atualiza a entidade no banco de dados
	 * 
	 * @param entity
	 * @return
	 */
	List<E> findAll();

}
