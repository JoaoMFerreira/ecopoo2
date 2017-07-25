package br.com.bortoletto.ecommerce.controllers;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

import br.com.bortoletto.ecommerce.business.LoginBiz;
import br.com.bortoletto.ecommerce.entities.Cliente;
import br.com.bortoletto.ecommerce.entities.factory.ClienteFactory;
import br.com.bortoletto.ecommerce.exceptions.BusinessException;

/**
 * Controller da tela de login
 * 
 * @author Vitor Bortoletto Junior 3 de jun de 2017
 */
@Named
@SessionScoped
public class LoginController implements Serializable {

	private LoginBiz loginBiz;
	/**
	 * 
	 */
	private static final long serialVersionUID = -8628239544967640797L;

	private String user;
	private String password;
	private Cliente novoCliente;

	public LoginController() {
		this.loginBiz = new LoginBiz();

	}

	/**
	 * 
	 * @return
	 */
	public String login() {
		boolean logado = loginBiz.validarLogin(user, password);
		if (!logado) {
			throw new BusinessException("Login ou senha incorretos.");
		}
		return "sistema/home";
	}

	public String logout() {
		return "login";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the novoCliente
	 */
	public Cliente getNovoCliente() {
		return novoCliente;
	}

	/**
	 * @param novoCliente
	 *            the novoCliente to set
	 */
	public void setNovoCliente(Cliente novoCliente) {
		this.novoCliente = novoCliente;
	}

	public void save() throws IOException {
		FacesMessage msg = new FacesMessage("Successful", "Welcome :" + novoCliente.getNome());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		FacesContext.getCurrentInstance().getExternalContext().redirect("sistema/home.xhtml");
		this.novoCliente = ClienteFactory.getInstance();
	}

	@PostConstruct
	public void init() {
		this.novoCliente = ClienteFactory.getInstance();
	}

	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
	}
}
