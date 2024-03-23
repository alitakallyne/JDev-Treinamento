package com.jdev.operacoes.entradadados;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EntradaDados {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		
		String nome;		
		StringBuilder mensagem = new StringBuilder();

	    nome = JOptionPane.showInputDialog("Digite seu nome:");
	    mensagem.append("Bem-vindo ").append(nome).append("!");
	    
	    int i = JOptionPane.showConfirmDialog(null, "Deseja ver o seu nome?");
	    
	    System.out.println(i);
	    
	    if(i == 0) {
	    	JOptionPane.showMessageDialog(null, mensagem);
	    }else {
	    	JOptionPane.showMessageDialog(null, "Tchauuu!");
	    }
	   
	  
	}

}
