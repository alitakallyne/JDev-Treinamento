package com.jdev.data;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DataInstant {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duracao em nanos segundos: "+ duracao.toNanos());
		
		System.out.println("Duracao em minutos: "+ duracao.toMinutes());
		
		System.out.println("Duracao em Horas: "+ duracao.toHoursPart());
		
		System.out.println("Duracao em Milisegundos: "+ duracao.toMillis());

	}

}
