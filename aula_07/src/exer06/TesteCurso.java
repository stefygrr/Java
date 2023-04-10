package exer06;

import java.time.LocalDate;

public class TesteCurso {

	public static void main(String[] args) {

		LocalDate ldc1 = LocalDate.of(1798, 04, 14);

		Especializacao c1 = new Especializacao("Java full stack power super flower sigma da sikva", 999, ldc1, 300000,"Longa", 5);

		c1.visualizar();

		System.out.println();

		LocalDate ldc2 = LocalDate.of(2024, 05, 23);

		Especializacao c2 = new Especializacao("Tech Java", 23, ldc2, 50 ,"curta", 5);

		c2.visualizar();

		System.out.println();

		LocalDate ldc3 = LocalDate.of(2023, 06, 20);

		CursoLivre c3 = new CursoLivre("mobile 2.0", 10, ldc2, 45, "curta", "Generation Brasil");

		c3.visualizar();
		System.out.println();
		
		LocalDate ldc4 = LocalDate.of(2023, 02, 17);

		CursoLivre c4 = new CursoLivre("Mine java", 5, ldc4, 38, "longo", "Proa");

		c4.visualizar();
		System.out.println();

	}

}
