package com.jdev.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ApiDatasParcelas {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataBase = LocalDate.parse("2024-07-16");

		
		for (int parcela = 1; parcela <= 12; parcela++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Parcela número : " + parcela + " Venciemnto é em : "+dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}

}
