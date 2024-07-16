package com.jdev.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasCalander {

	public static void main(String[] args) throws ParseException  {
		
		Calendar calendar = Calendar.getInstance();// PEga as data atual 
		
		//SIMULAR A DATA QUE VEM DO BANCO
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyy").parse("10-03-2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 40); //Data hoje mais 40 dias
		
		System.out.println("SOmando o dia do mes : "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		
		calendar.add(Calendar.MONTH, 1); 
		
		System.out.println("SOmando o mes : "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		
		calendar.add(Calendar.YEAR, 1); 
		
		System.out.println("SOmando 1 ano : "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
