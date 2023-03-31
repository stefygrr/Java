package exer06;

import java.time.LocalDate;

public class TesteCurso {

	public static void main(String[] args) {
		
		LocalDate ldc1 = LocalDate.of(2023, 04, 14 );
		
		Curso c1 = new Curso("Pedagogia", 12, ldc1, 40, 5);
		
		c1.visualizar();
		
		System.out.println();
		
		LocalDate ldc2 = LocalDate.of(2023, 06, 20 );

		Curso c2 = new Curso("Odontologia", 8, ldc2, 45, 5);
		
		c2.visualizar();
		System.out.println();
	}

}
