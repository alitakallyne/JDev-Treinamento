package com.jdev.data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataTempo {

	public static void main(String[] args)  throws ParseException {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"),LocalDate.now()); //total de dias até hoje, Poder contado em meses, anos, dias.
		
		System.out.println("Possui "+ dias + " dias entra a faixa de data");
	}

}
