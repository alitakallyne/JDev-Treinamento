package com.jdev.threadFilaPilha;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		
		pilha_fila.add(objetoFilaThread);
		
	}
	
	
	@Override
	public void run() {
		
		System.out.println("Rodando ");

		while(true) {
			
			
			
			synchronized (pilha_fila) { // BLOQUEAR ACESSO A ESSA LISTA POR OUTRO PROCESSO
				
				Iterator iteracao = pilha_fila.iterator();
				
				while(iteracao.hasNext()) {//ENQUANTO TIVER DADOS NA LISTA IRA PROCESSAR
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //PEGA O OBJETO ATUAL
					
					/*
					 * PROCESSAR 10 MIL NOTAS FISCAIS
					 * GERAR UMA LISTA DE ENORME DE PDF
					 * GERAR ENVIO EM MASSA DE EMAIS
					 * */
					
					System.out.println("--------------------------------------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					
					iteracao.remove();
					
					try {
						Thread.sleep(100); //DAR UM TEMPO PARA DESGARGA DE MEMORIA
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				
			}
			
			try {
				Thread.sleep(1000); //DAR UM TEMPO PARA LIMPEZA DE MEMORIA
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	

}
