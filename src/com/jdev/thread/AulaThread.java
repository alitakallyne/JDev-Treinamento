package com.jdev.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		//THREAD EM PARALELO PROCESSANDO ENVIO DE EMAIL
		new Thread() {
			
			public void run() //EXECUTA O QUE NOS QUEREMOS
			{
			
				//CODIGO DA ROTINA
				
				/*Código de rotina que que quero executar em parelelo */
				for (int i = 0; i < 10; i++) {
					
					/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
					
					
					System.out.println("Executando alguma rotina , por exemplo envio e email...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //da um Tempo 
								
				}
			}
		}.start(); //LIGA A THREAD QUE FICA PROCESSANDO PARALELAMENTE POR TRÁS
		
		
		
		//THREAD EM PARALELO PROCESSANDO ENVIO DE NOTS FISCAL
				new Thread() {
					
					public void run() //EXECUTA O QUE NOS QUEREMOS
					{
					
						//CODIGO DA ROTINA
						
						/*Código de rotina que que quero executar em parelelo */
						for (int i = 0; i < 10; i++) {
							
							/* Quero executar esse envio com um tempo de parada ou com um tempo determinado */
							
							
							System.out.println("Executando alguma rotina , por exemplo envio de nota fiscal...");
							
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} //da um Tempo 
										
						}
					}
				}.start(); //LIGA A THREAD QUE FICA PROCESSANDO PARALELAMENTE POR TRÁS
		
		
		/* Código de rotina do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim a Thread...");
		JOptionPane.showMessageDialog(null, "Sistema cintinua executando para o usuário");

	}

}
