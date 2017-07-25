package br.com.bortoletto.ecommerce.utils;

import br.com.bortoletto.ecommerce.constants.Constantes;

/**
 * 
 * @author Vitor Bortoletto Junior
 * 3 de dez de 2016
 */
public final class DaoUtils {
	
	private DaoUtils() {
	}
	
	/**
	 * Metodo utilitário que adiciona a paginação na query da especificacao JPA.
	 * 
	 * @param query
	 * @param page
	 * @param pageSize
	 * @return A propria instancia do parametro query com a paginacao setada
	 */
	public static javax.persistence.Query paginateQuery(javax.persistence.Query query, Integer page, Integer pageSize){
		if(query == null){
			throw new IllegalArgumentException(String.format(Constantes.ARGUMENTO_INVALIDO, "paginateQuery"));
		}
		if(page == null || pageSize == null){
			return query;
		}
		int firstPos = (page * pageSize) - 1;
		query.setFirstResult(firstPos);
		query.setMaxResults(pageSize);
		return query;
	}
	
	/**
	 * Metodo utilitário que adiciona a paginação na query da especificacao JPA.
	 * 
	 * @param query
	 * @param page
	 * @param pageSize
	 * @return A propria instancia do parametro query com a paginacao setada
	 */
	public static org.hibernate.Query paginateQuery(org.hibernate.Query query, Integer page, Integer pageSize){
		if(query == null){
			throw new IllegalArgumentException(String.format(Constantes.ARGUMENTO_INVALIDO, "paginateQuery"));
		}
		if(page == null || pageSize == null){
			return query;
		}
		int firstPos = (page * pageSize) - 1;
		query.setFirstResult(firstPos);
		query.setMaxResults(pageSize);
		return query;
	}
}
