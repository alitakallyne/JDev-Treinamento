package com.jdev.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println("Data em milsegundos: "+ date.getTime());
		
		System.out.println("Ano : " +(date.getYear()+1900));
		
		System.out.println("Dia do mes: " +date.getDate());
		
		System.out.println("Dia da semana: " +date.getDay());

		System.out.println("Hora do dia: " +date.getHours());
		
		System.out.println("Minuto da Hora: " +date.getMinutes());
		
		System.out.println("Segundo da Hora: " +date.getSeconds());
		
		System.out.println("--------------------------------------------------------");
		/*
		 *FORMATANDO DATAS 
		 **/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data no formato String e Padrão : "+simpleDateFormat.format(date));
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");
		
		System.out.println("Data no formato para banco de dados : "+simpleDateFormat2.format(date));
		
		System.out.println("Objeto no formato Data: "+simpleDateFormat.parse("07/10/96 04:59.3"));
		
		// DATAS USANDO CALENDAR
		System.out.println("---------------------------------------------------------------");
		System.out.println("Datas usando calendar");
		
		Calendar calendar  = Calendar.getInstance();
		
		System.out.println(calendar);
		
		System.out.println("Data em milsegundos: "+ calendar.getTimeInMillis());
		
		System.out.println("Ano : " +calendar.get(calendar.YEAR));
		
		System.out.println("Dia do mes: " +calendar.get(calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " +calendar.get((calendar.DAY_OF_WEEK)-1));

		System.out.println("Hora do dia: " +calendar.get(calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da Hora: " +calendar.get(calendar.MINUTE));
		
		System.out.println("Segundo da Hora: " +calendar.get(calendar.SECOND));
		
		System.out.println("--------------------------------------------------------");
		/*
		 *FORMATANDO DATAS 
		 **/
		
		SimpleDateFormat simpleDateFormatCalendar = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data calendar no formato String e Padrão : "+simpleDateFormatCalendar.format(calendar.getInstance().getTime()));
		
		SimpleDateFormat simpleDateFormatCalendar2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");
		
		System.out.println("Data no formato para banco de dados : "+simpleDateFormatCalendar2.format(calendar.getInstance().getTime()));
		
		System.out.println("Objeto no formato Data: "+simpleDateFormatCalendar.parse("07/10/96 04:59.3"));
		
		
		
	}

}
