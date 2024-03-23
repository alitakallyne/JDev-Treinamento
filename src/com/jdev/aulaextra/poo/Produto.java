package com.jdev.aulaextra.poo;

import java.math.BigDecimal;

public class Produto {

	private Long id;
	private String nome;
	private BigDecimal valor;
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}
	
	
	
}
