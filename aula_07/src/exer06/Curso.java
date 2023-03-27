package exer06;

import java.time.LocalDate;

public class Curso {

	private String nomeCurso;
	private int quantidadeDisciplinas;
	private LocalDate dataProvaMes;
	private int quantidadeAlunos;  
	private double notaMec;
	
	public Curso(String nomeCurso, int quantidadeDisciplinas, LocalDate dataProvaMes, int quantidadeAlunos,
			double notaMec) {
		this.nomeCurso = nomeCurso;
		this.quantidadeDisciplinas = quantidadeDisciplinas;
		this.dataProvaMes = dataProvaMes;
		this.quantidadeAlunos = quantidadeAlunos;
		this.notaMec = notaMec;
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

	public double getNotaMec() {
		return notaMec;
	}

	public void setNotaMec(double notaMec) {
		this.notaMec = notaMec;
	}
	
	public void visualizar() {
		
		System.out.println("****************************************");
	    System.out.println("         DADOS DO CURSO                 ");
	    System.out.println("****************************************");
	    System.out.println("Nome do curso: "+ this.nomeCurso);
	    System.out.println("Quantidade de Disciplinas: " + this.quantidadeDisciplinas );
	    System.out.println("Data mensal da Prova: "+ dataProvaMes);
	    System.out.println("Quantidade de Alunos: "+ this.quantidadeAlunos);
	    System.out.println("Nota do Mec referente ao curso: " +  this.notaMec);
	}
		

}
	