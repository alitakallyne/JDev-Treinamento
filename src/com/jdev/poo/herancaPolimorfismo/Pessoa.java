package com.jdev.poo.herancaPolimorfismo;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	
	
	public abstract double salario(); 
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	
	
}
