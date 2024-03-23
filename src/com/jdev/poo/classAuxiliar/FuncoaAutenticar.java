package com.jdev.poo.classAuxiliar;

import com.jdev.poo.interfaces.PermitirAcesso;

public class FuncoaAutenticar {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
	}

	public FuncoaAutenticar(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	
	

}
