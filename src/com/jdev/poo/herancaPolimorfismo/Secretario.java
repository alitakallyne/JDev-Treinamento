package com.jdev.poo.herancaPolimorfismo;

import com.jdev.poo.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario() {
		
	}
	
    public Secretario(String login,String senha) {
	 this.login = login;
	 this.senha = senha;
	}
	
	
	public String getRegistro() {
		return registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.57;
	}
	@Override
	public String toString() {
		return "Secretario [getNome()=" + getNome() + "]";
	}
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
	
	
	
	
	
	
}
