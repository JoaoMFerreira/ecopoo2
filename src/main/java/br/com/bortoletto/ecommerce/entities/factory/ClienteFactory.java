package br.com.bortoletto.ecommerce.entities.factory;

import br.com.bortoletto.ecommerce.entities.Cliente;
import br.com.bortoletto.ecommerce.entities.Endereco;
import br.com.bortoletto.ecommerce.entities.Login;

public class ClienteFactory {

	private ClienteFactory() {

	}

	public static Cliente getInstance() {
		Cliente cliente = new Cliente();
		cliente.setEndereco(new Endereco());
		cliente.setLogin(new Login());
		return cliente;
	}

}
