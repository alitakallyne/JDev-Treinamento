package com.jdev.poo.herancaPolimorfismo;

import com.jdev.poo.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String senha;
	
	
	
	
	public Diretor() {
		
	}
	public Diretor(String login, String senha) {
	
		this.login = login;
		this.senha = senha;
	}
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3000.56;
	}
	@Override
	public String toString() {
		return "Diretor [getNome()=" + getNome() + "]";
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
