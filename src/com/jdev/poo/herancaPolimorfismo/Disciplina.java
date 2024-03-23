package com.jdev.poo.herancaPolimorfismo;

public class Disciplina {

	private double nota;
	private String disciplina;
	
	
	public double getNota() {
		return nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
	
	
}
