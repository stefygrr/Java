package exer06;

import java.time.LocalDate;

public class Especializacao extends Curso {

	private int notamec;

	public Especializacao(String nomeCurso, int quantidadeDisciplinas, LocalDate dataProvaMes, int quantidadeAlunos,
			String duracao, int notamec) {
		super(nomeCurso, quantidadeDisciplinas, dataProvaMes, quantidadeAlunos, duracao);
		this.notamec = notamec;
	}

	public int getNotamec() {
		return notamec;
	}

	public void setNotamec(int notamec) {
		this.notamec = notamec;
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
		System.out.println("Nota do MEC: " + this.notamec);

	}

}
