package com.jdev.matriz;

import java.util.Arrays;
import java.util.List;

public class Matriz {

	
	public static void main(String[] args) {
		
		double notas [][] = new double [2][2];
		
		notas[0][0] = 1;
		notas[0][1] = 2;
		notas[1][0] = 3;
		notas[1][1] = 4;
		
		System.out.println(notas);
		
		
		for(int i = 0 ; i< notas.length; i++) {
			for(int j = 0 ; j< notas.length ; j++) {
				System.out.println("Valor da nota na posicao ["+(i+1)+"]["+(j+1)+"] = "+notas[i][j]);
				
				
			}
		}
		
		String texto = "Alita,90,50,45,34";
		
		String [] s = texto.split(",");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Array = "+s[i]);
		}
		
		System.out.println("--------------------------------------------------------");
		// Converter um array em uma lista 
		
		List<String> ArrayToList = Arrays.asList(s);
		
		for(String valor : ArrayToList) {
			System.out.println(valor);
		}
		
		System.out.println("--------------------------------------------------------");
		// Converter uma lista para array
		
		String[] listToArray = ArrayToList.toArray(new String [5] );
	}
}
