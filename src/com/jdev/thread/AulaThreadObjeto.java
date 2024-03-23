package com.jdev.thread;

import javax.swing.JOptionPane;

public class AulaThreadObjeto {

	public static void main(String[] args) {


		//THREAD EM PARALELO PROCESSANDO ENVIO DE EMAIL
		Thread threadEmail = new Thread(thread1); 
		threadEmail.start();		
		
		//THREAD EM PARALELO PROCESSANDO ENVIO DE NOTS FISCAL
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		/* Código de rotina do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim a Thread...");
		JOptionPane.showMessageDialog(null, "Sistema cintinua executando para o usuário");

		}
	

	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
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
			
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
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
	};

}
