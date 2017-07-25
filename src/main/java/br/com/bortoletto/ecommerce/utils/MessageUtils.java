/**
 * 
 */
package br.com.bortoletto.ecommerce.utils;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author vbortole
 *
 */
public final class MessageUtils {

	/**
	 * Bundle de mensagens
	 */
	private static final ResourceBundle messageBundle = ResourceBundle.getBundle("MessageBundle");
	private static final Logger LOGGER = LogManager.getLogger();

	private MessageUtils() {
	}

	public static String getMessage(String key) {
		LOGGER.debug(String.format("Recuperando mensagem com a chave [%s] do MessageBundle", key));
		return messageBundle.getString(key);
	}

	public static String getFormatedMessage(String key, Object... args) {
		LOGGER.debug(String.format("Recuperando mensagem formatada com a chave [%s] do MessageBundle", key));
		String mensagem = messageBundle.getString(key);
		return MessageFormat.format(mensagem, args);
	}
}
