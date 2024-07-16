package com.jdev.data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class APIDatasMesDiaAno {

	public static void main(String[] args) throws ParseException {

		LocalDate localdate = LocalDate.now();
		
		System.out.println("Data atual: "+localdate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: "+localdate.getDayOfWeek());
		
		System.out.println("Dia do mes: "+localdate.getDayOfMonth());
		
		System.out.println("Dia do ano: "+localdate.getDayOfYear());
		
		System.out.println("Mes: "+localdate.getMonth());
		
		System.out.println("Ano: "+localdate.getYear());

	}

}
