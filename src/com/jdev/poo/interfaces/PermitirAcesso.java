package com.jdev.poo.interfaces;

public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
}
