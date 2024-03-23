package com.jdev.aulaextra.poo;

import java.math.BigDecimal;

public class Executarteste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome("Orientação a Objetos");
		produto1.setValor(BigDecimal.valueOf(100.00));
		
		Produto produto2 = new Produto();
		
		produto2.setId(2L);
		produto2.setNome("Modulo de Spring Boot API Rest");
		produto2.setValor(BigDecimal.valueOf(300.00));
		
		
	    Produto produto3 = new Produto();
		
		produto3.setId(3L);
		produto3.setNome("Modulo de Angular 8");
		produto3.setValor(BigDecimal.valueOf(120.00));
		
		Venda venda = new Venda();
		
		venda.setDescricaoVenda("Venda curso formação java");
		venda.setEnderecoEntrega("Entrega pelo email");
		venda.setId(10L);
		venda.setNomeCliente("Alita");
		venda.setValortotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); //Não consigo fazer validações 
		
		venda.addProduto(produto3); // Dentro do metodo AddProduto, consigo fazer validações antes de add a Lista.
		
		System.out.println(venda);
		
		System.out.println("O valor total dessa venda e: "+venda.getValortotal());
		
		

	}

}
