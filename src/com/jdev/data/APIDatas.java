package com.jdev.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class APIDatas {

	public static void main(String[] args)  throws ParseException {
		
		/* Nova API de data a partir do Java 8  */
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: "+dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora Atual "+ horaAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e Hora Atual: "+dataHoraAtual);
		
		System.out.println("data formatada "+ dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		

	}

}
