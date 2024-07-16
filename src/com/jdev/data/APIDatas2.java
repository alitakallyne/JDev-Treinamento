package com.jdev.data;

import java.text.ParseException;
import java.time.LocalDate;

public class APIDatas2 {

	public static void main(String[] args)  throws ParseException, InterruptedException{
		
		LocalDate dataBase = LocalDate.parse("2024-07-16");
		
		System.out.println("Mais 5 dias :"+ (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas :"+ (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 Anos :"+ (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 2 meses :"+ (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Menos 1 ano :"+ (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 mes :"+ (dataBase = dataBase.minusMonths(1)));
		
		System.out.println("Menos 20 dia :"+ (dataBase = dataBase.minusDays(20)));
	}

}
