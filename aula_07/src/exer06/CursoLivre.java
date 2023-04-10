package exer06;

import java.time.LocalDate;

public class CursoLivre extends Curso {

	private String patrocinador;

	
	public CursoLivre(String nomeCurso, int quantidadeDisciplinas, LocalDate dataProvaMes, int quantidadeAlunos,
			String duracao, String patrocinador) {
		super(nomeCurso, quantidadeDisciplinas, dataProvaMes, quantidadeAlunos, duracao);
		this.patrocinador = patrocinador;
	}

	
	
	public String getPatrocinador() {
		return patrocinador;
	}



	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}


	@Override
	public void visualizar() {
		
		System.out.println("****************************************");
		System.out.println("         DADOS DO CURSO                 ");
		System.out.println("****************************************");
		System.out.println("Nome do curso: " + this.getNomeCurso());
		System.out.println("Quantidade de Disciplinas: " + this.getQuantidadeDisciplinas());
		System.out.println("Data mensal da Prova: " + this.getDataProvaMes());
		System.out.println("Quantidade de Alunos: " + this.getQuantidadeAlunos());
		System.out.println("Duração do curso: " + this.getDuracao());
		System.out.println("Patrocinador: " + this.patrocinador);
		
	}
}
