package com.jdev.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataComParcelas {

	public static void main(String[] args)   throws ParseException{
		
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/07/2024");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela número : " + parcela + " Venciemnto é em : "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
