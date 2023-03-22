package aula_04;

import java.util.Scanner;

public class ExerMatriz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        double notasAlunos [][] = new double[10][4];
        double mediaAlunos [] = new double[10];
        double soma = 0;
        int teste[][] = new int[8][4];
        int count = 0, alunoCount = 1, alunoCountAux = 0;

        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                count++;
                System.out.println("Digite a "+count+" º nota do "+alunoCount+" º Aluno: ");
                notasAlunos[i][j] = scan.nextDouble();
            }
            count = 0;
            alunoCount++;
        }

        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];

            }
            mediaAlunos[i] = soma / notasAlunos[i].length;
            soma = 0;
            System.out.println();
        }

        for(int i = 0; i < mediaAlunos.length; i++){
            alunoCountAux = alunoCountAux;
            alunoCountAux++;
            System.out.println("A média do "+alunoCountAux+" º Aluno é de: "+mediaAlunos[i]);

        }

	}

}
