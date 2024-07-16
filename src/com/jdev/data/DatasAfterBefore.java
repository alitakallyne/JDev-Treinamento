package com.jdev.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasAfterBefore {

	public static void main(String[] args)  throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2024");
		
		
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2024");
		

		if(dataVencimentoBoleto.before(dataAtualHoje)) { //After - Se data 1 é maior que data 2 Posterior ou maior ou depois da data atual, Before = Se data 1 é menor que a data 2
			System.out.println("Boleto não Vencido");
		}else {
			System.out.println("Boleto Vencido");
		}
	}

}
