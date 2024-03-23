package com.jdev.operacoes.listas;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import com.jdev.constantes.StatusAluno;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			HashMap<String,List<Aluno>> maps = new HashMap<String,List<Aluno> >();
			
			// Ao inves de criar essa 3 lista, crio um Hash map para guarda a chave ligada ao objeto, que no caso, chave = Status, Objeto = Aluno
			
			//List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			//List<Aluno> alunosReprovados = new ArrayList<Aluno>();
			//List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			
			for (int i = 1; i <= 3; i++) {
				
			
			
				
				String nome = JOptionPane.showInputDialog("Qual é o nome do aluno "+(i)+" : ");
				/*String idade = JOptionPane.showInputDialog("Qual é sua idade: ");
				String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento: ");
				String rg = JOptionPane.showInputDialog("Qual seu registro geral: ");
				String cpf = JOptionPane.showInputDialog("Qual seu cpf: ");
				String mae = JOptionPane.showInputDialog("Nome mãe: ");
				String pai = JOptionPane.showInputDialog("Nome pai: ");
				String matricula = JOptionPane.showInputDialog("Data da matricula: ");
				String serie = JOptionPane.showInputDialog("Qual a serie");
				String escola = JOptionPane.showInputDialog("Nome escola: ");*/
				
				Aluno aluno1 = new Aluno();
				
				aluno1.setNome(nome);
				/*aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setRegistroGeral(rg);
				aluno1.setNumeroCpf(cpf);
				aluno1.setNomeMae(mae);
				aluno1.setNomePai(pai);
				aluno1.setDataMatricula(matricula);
				aluno1.setSerieMatriculado(serie);
				aluno1.setNomeEscola(escola);*/
				
				//Criar disciplinas dinamicamente 
				
				for(int pos = 1 ; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Qual é o nome disciplina "+pos+ ": ");
					String notaDisciplina = JOptionPane.showInputDialog("Qual é nota disciplina: "+pos+ ": ");
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));
					
					aluno1.getDisciplina().add(disciplina);
					
				}
				
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				Integer.valueOf(escolha);
				
				
				if(escolha == 0) {
					int continuarRemover = 0;
					int posicao = 1;
					
					while(continuarRemover == 0) {
						
							
							String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina remover 1,2,3 ou 4 ?");
							aluno1.getDisciplina().remove(escolha-posicao); 
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
						 
						}
						
						
				}
				
				
				alunos.add(aluno1);
			 
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			
			
			for (Aluno aluno : alunos) {
				if(aluno.getALunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				}else {
					if(aluno.getALunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}
			}
			
			System.out.println("------------------------------------Lista de Alunos Aprovados----------------------------------------------");
			
			for(Aluno aluno: maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno "+ aluno.getNome()+" Resultado : "  +aluno.getALunoAprovado2()+" com media de :"+aluno.getMediaNota());
			}
			
			System.out.println("------------------------------------Lista de Alunos Recuperação----------------------------------------------");
			
			for(Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno "+ aluno.getNome()+" Resultado : "+aluno.getALunoAprovado2()+" com media de :"+aluno.getMediaNota());
			}
		
			
	       System.out.println("------------------------------------Lista de Alunos Reprovados----------------------------------------------");
			
			for(Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno "+ aluno.getNome()+" Resultado : "+aluno.getALunoAprovado2()+" com media de :"+aluno.getMediaNota());
			}
			
			/*
			 * Cirado estaticamente 
			Disciplina d1 = new Disciplina();
			d1.setDisciplina("Banco de Dados");
			d1.setNota(90);
			aluno1.getDisciplina().add(d1);
			
			Disciplina d2 = new Disciplina();
			d2.setDisciplina("Matematica");
			d2.setNota(50);
			aluno1.getDisciplina().add(d2);
			
			Disciplina d3 = new Disciplina();
			d3.setDisciplina("Geografia");
			d3.setNota(87);
			aluno1.getDisciplina().add(d3);
			
			Disciplina d4 = new Disciplina();
			d4.setDisciplina("Java");
			d4.setNota(65);
			aluno1.getDisciplina().add(d4);*/
			
			/*
			
			for (Aluno aluno : alunos) {
				if(aluno.getNome().equalsIgnoreCase("Alex")) {
					
					alunos.remove(aluno);
					
					break;
				}else {
					System.out.println(aluno);
					System.out.println("Media do aluno = "+aluno.getMediaNota());
					System.out.println("Resultado = "+aluno.getALunoAprovado2());
					System.out.println("---------------------------------------");
				}
		
			}*/
			
			//Acessando Objetos por posição
	//		for (int pos = 0; pos <alunos.size(); pos++) {
	//			Aluno aluno = alunos.get(pos);
	//			
	//			//Trocar Objetos
	//			if(aluno.getNome().equalsIgnoreCase("alex")) {
	//				Aluno trocar = new Aluno();
	//				trocar.setNome("Aluno foi trocado");
	//				
	//				Disciplina d = new Disciplina();
	//				d.setDisciplina("Matematica");
	//				d.setNota(90);
	//				
	//				trocar.getDisciplina().add(d);
	//				
	//				alunos.set(pos, trocar);
	//				aluno =  alunos.get(pos);
	//			}
	//			
	//			System.out.println("Aluno "+aluno.getNome());
	//			System.out.println("Media do aluno = "+aluno.getMediaNota());
	//			System.out.println("Resultado = "+aluno.getALunoAprovado2());
	//			System.out.println("---------------------------------------");
	//			
	//			
	//			for (int posd = 0;posd < aluno.getDisciplina().size(); posd++) {
	//			// for percorrendo sem posuição for (Disciplina disc : aluno.getDisciplina()) {
	//				Disciplina disc = aluno.getDisciplina().get(posd);
	//				System.out.println("Disciplina : "+ disc.getDisciplina()+", Nota : "+disc.getNota());
	//		
	//			}
	//			
	//			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	//			
	//		}
		}
	}

}
