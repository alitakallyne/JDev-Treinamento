package com.jdev.operacoes.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.jdev.constantes.StatusAluno;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}
	public double getMediaNota() {
		double soma = 0.0;
		
	
		for (Disciplina disciplina1 : disciplinas) {
			soma += disciplina1.getNota();
			
		}
		
	
		return soma/disciplinas.size();
	}
	
	public boolean getALunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 7.0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getALunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}{
				return StatusAluno.RECUPERACAO;
			}
					
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado +  "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, disciplinas, idade, nome, nomeEscola, nomeMae, nomePai,
				numeroCpf, registroGeral, serieMatriculado);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(disciplinas, other.disciplinas)
				&& idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}

	
}
