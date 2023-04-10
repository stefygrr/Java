package exer06;

import java.time.LocalDate;

public class Curso {

	private String nomeCurso;
	private int quantidadeDisciplinas;
	private LocalDate dataProvaMes;
	private int quantidadeAlunos;  
	private String duracao;
	
	
	

	public Curso(String nomeCurso, int quantidadeDisciplinas, LocalDate dataProvaMes, int quantidadeAlunos,
			String duracao) {
		this.nomeCurso = nomeCurso;
		this.quantidadeDisciplinas = quantidadeDisciplinas;
		this.dataProvaMes = dataProvaMes;
		this.quantidadeAlunos = quantidadeAlunos;
		this.duracao = duracao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getQuantidadeDisciplinas() {
		return quantidadeDisciplinas;
	}

	public void setQuantidadeDisciplinas(int quantidadeDisciplinas) {
		this.quantidadeDisciplinas = quantidadeDisciplinas;
	}

	public LocalDate getDataProvaMes() {
		return dataProvaMes;
	}

	public void setDataProvaMes(LocalDate dataProvaMes) {
		this.dataProvaMes = dataProvaMes;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	
	
	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public void visualizar() {
		
		System.out.println("****************************************");
	    System.out.println("         DADOS DO CURSO                 ");
	    System.out.println("****************************************");
	    System.out.println("Nome do curso: "+ this.nomeCurso);
	    System.out.println("Quantidade de Disciplinas: " + this.quantidadeDisciplinas );
	    System.out.println("Data mensal da Prova: "+ dataProvaMes);
	    System.out.println("Quantidade de Alunos: "+ this.quantidadeAlunos);
	    System.out.println("Duração do curso: "+ this.duracao);
	    
	}
		

}
	