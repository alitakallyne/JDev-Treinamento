package com.jdev.poo.herancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

import com.jdev.operacoes.listas.Disciplina;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricula;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public String getDataMatricula() {
		return dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public String getSerieMatricula() {
		return serieMatricula;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}



	@Override
	public String toString() {
		return "Aluno [getNome()=" + getNome() + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
