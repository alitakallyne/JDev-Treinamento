package com.jdev.poo.herancaPolimorfismo;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jdev.poo.classAuxiliar.FuncoaAutenticar;
import com.jdev.poo.interfaces.PermitirAcesso;

import com.jdev.excecao.*;

public class App {

	public static void main(String[] args) throws ExcecaoProcessarNota {
		
//		try{
//			File fill =new File("lines.txt");
//			Scanner scan = new Scanner(fill);
//		} catch(FileNotFoundException e) {
//			throw new ExcecaoProcessarNota("Erro no processamento de notas!");
//		}
//				
//			
			
			
		try {
			
		//	lerArquivo();
			
			Aluno aluno = new Aluno();
			aluno.setNome("Aluno novo");
			aluno.setIdade(Integer.valueOf(7));
			
			Diretor diretor =  new Diretor();
			diretor.setNome("Nome diretor");
			
			Secretario secretario = new Secretario();
			secretario.setNome("Nome Secretario");
			
			System.out.println(aluno);
			System.out.println(diretor);
			System.out.println(secretario);
			
			
			System.out.println("Salario aluno: "+aluno.salario());
			System.out.println("Salario Diretor: "+ diretor.salario() );
			System.out.println("Salario secretario: "+secretario.salario());
			
			//Polimorfismo, Overrade indica sobrescrição de metodo.
			
			teste(aluno);
			teste(diretor);
			teste(secretario);
			
			String login = JOptionPane.showInputDialog("Informe login:");
			
			String senha = JOptionPane.showInputDialog("Informe senha:");
			
		//	PermitirAcesso permitirAcesso = new Secretario(login,senha);
			
			if( new FuncoaAutenticar(new Diretor(login,senha)).autenticar()) {
				JOptionPane.showMessageDialog(null, "Acesso Permitido");
			}else {
				JOptionPane.showMessageDialog(null, "Acesso Negado");
			}
		
		}catch(NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); //Impreme pinha de erros no console java
			
			//Mensagem da causa do erro
			System.out.println("mensagem "+e.getMessage());
			
			for(int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\nClasse de erro : "+e.getStackTrace()[pos].getClassName());
				saida.append("\nMetodo de erro : "+e.getStackTrace()[pos].getMethodName());
				saida.append("\nLinha de erro : "+e.getStackTrace()[pos].getLineNumber());
				saida.append("\nClass : "+e.getStackTrace()[pos].getClassLoaderName());
			}
			
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas"+saida.toString());
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro de NullPointerException"+e.getClass());
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado: "+e.getClass().getName());
		}
		
		finally { // Sempre vai executar independe de erro ou não
			JOptionPane.showMessageDialog(null,"Obrigado por aprender java comigo!");
		}
		
		//Aqui
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Esta pessoas e: "+ pessoa.getNome()+", com salario de : "+pessoa.salario() );
	}
	
	public static void lerArquivo( ) throws FileNotFoundException {
		
		try {
			File fill =new File("lines.txt");
			Scanner scan = new Scanner(fill);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(e.getMessage());
		}
		
		
	}

}
