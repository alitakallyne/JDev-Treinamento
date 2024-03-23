package com.jdev.operacoes.operacoes;

import java.awt.JobAttributes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		
	    String nota1 = JOptionPane.showInputDialog("Informe nota1:");
	    String nota2 = JOptionPane.showInputDialog("Informe nota2:");
	    String nota3 = JOptionPane.showInputDialog("Informe nota3:");
	    String nota4 = JOptionPane.showInputDialog("Informe nota4:");
	    
	    double dNota1 = Double.parseDouble(nota1);
	    double dNota2 = Double.parseDouble(nota2);
	    double dNota3 = Double.parseDouble(nota3);
	    double dNota4 = Double.parseDouble(nota4);
	    
	    double media = (dNota1+dNota2+dNota3+dNota4)/4;
	    
	    if(media >= 50){
	    	if(media >= 70) {
	    		JOptionPane.showMessageDialog(null, "Aluno está aprovado com media de :"+media);
	    	}else {
	    		JOptionPane.showMessageDialog(null, "Aluno esta de recupercao com media de: "+media);
	    	}
	    }else {
	    	JOptionPane.showMessageDialog(null, "Aluno esta reprovado com media de: "+media);
	    }
	    
	    JOptionPane.showMessageDialog(null, "A media e: "+media);
	    
	    
	}

}
