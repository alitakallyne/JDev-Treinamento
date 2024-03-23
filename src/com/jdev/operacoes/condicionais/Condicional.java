package com.jdev.operacoes.condicionais;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*Estrutura de repetição FOR e COntinue*/
		
		for (int i = 0; i <= 10; i++) {
			if(i ==3 || i == 6 || i == 9) {
				System.out.println("Obaaa, encontrei o numero,"+i);
				continue;
			}
			System.out.println("Processando laço");
		}
		 
	}

}
