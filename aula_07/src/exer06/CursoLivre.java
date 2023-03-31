package exer06;

import java.time.LocalDate;

public class CursoLivre extends Curso {

	private String generationbrasil;

	public CursoLivre(String nomeCurso, int quantidadeDisciplinas, LocalDate dataProvaMes, int quantidadeAlunos,
			double notaMec, String generationbrasil) {
		super(nomeCurso, quantidadeDisciplinas, dataProvaMes, quantidadeAlunos, notaMec);
		this.generationbrasil = generationbrasil;
	}

	public String getGenerationbrasil() {
		return generationbrasil;
	}

	public void setGenerationbrasil(String generationbrasil) {
		this.generationbrasil = generationbrasil;
	}
	
	public void visualizar() {
		System.out.println("\nGeneration Brasil: " + generationbrasil);
	}
}
