/**
 * 
 */
package br.com.bortoletto.ecommerce.exceptions;

/**
 * @author vbortole
 *
 */
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BusinessException() {
	}

	/**
	 * 
	 * @param message
	 */
	public BusinessException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param throwable
	 */
	public BusinessException(Throwable throwable) {
		super(throwable);
	}
}
