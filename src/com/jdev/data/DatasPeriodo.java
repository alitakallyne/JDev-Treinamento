package com.jdev.data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasPeriodo {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		//LocalDate dataAntiga = LocalDate.of(2023, 2, 7);
		LocalDate dataAntiga = LocalDate.parse("2022-10-05");
		
		//LocalDate dataNova = LocalDate.of(2024, 7, 4);
		LocalDate dataNova = LocalDate.parse("2024-10-10");
		
		System.out.println("data antiga é maior que data nova: "+dataAntiga.isAfter(dataNova));
		
		System.out.println("data antiga é anterior a data nova: "+dataAntiga.isBefore(dataNova));
		
		System.out.println("datas são igauis: "+dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias : "+periodo.getDays());
		
		System.out.println("Quantos Meses : "+periodo.getMonths());
		
		System.out.println("Quantos Anos : "+periodo.getYears());
		
		
		System.out.println("Periodo é : "+periodo.getYears()+" ano  "+periodo.getMonths()+  " meses e "+ periodo.getDays()+" dias.");
	}

}
