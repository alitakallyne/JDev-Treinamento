package com.jdev.aulaextra.poo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valortotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public Long getId() {
		return id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public BigDecimal getValortotal() {
		this.valortotal = BigDecimal.valueOf(valorTotalVenda());
		return valortotal;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
	}
	
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	
	public void addProduto(Produto produto) {
		//Poderia fazer validações 
	 this.listaProdutos.add(produto);
	}
	
	private double valorTotalVenda() {
		
		double total = 0.0;
		
		for(Produto produto :listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		
		
		return total;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valortotal=" + valortotal + ", listaProdutos="
				+ listaProdutos.toString() + "]";
	}
	
	
	
	
}
