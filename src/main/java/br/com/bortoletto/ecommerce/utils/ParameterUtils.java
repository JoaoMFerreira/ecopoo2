package br.com.bortoletto.ecommerce.utils;

import java.util.Collection;

import org.apache.commons.collections4.CollectionUtils;

/**
 * Utilitario para validacao de parametros
 * 
 * @author Vitor Bortoletto Junior 3 de jun de 2017
 */
public final class ParameterUtils {

	private ParameterUtils() {
		// Previne instanciacao
	}

	/**
	 * Valida se todos os parametros sao nao null, no caso de Collections, valida se elas sao vazias
	 * 
	 * @param params
	 */
	public static void validar(Object... params) {
		for (Object param : params) {
			if (param == null) {
				throw new IllegalArgumentException("Algum parametro obrigatório não foi informado");
			} else if (param instanceof Collection<?>) {
				Collection<?> collection = (Collection<?>) param;
				if (CollectionUtils.isEmpty(collection)) {
					throw new IllegalArgumentException("Algum parametro obrigatório não foi informado");
				}
			}
		}
	}
}
