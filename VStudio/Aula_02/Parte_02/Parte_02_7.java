import java.util.Scanner;

public class Parte_02_7 {
    //TODO:7 - Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas 
    // e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[][] notas = new double[3][4];

        //------------------------------
        for(int i = 0; i < 3; i++){
            System.out.println("Digite as nota do aluno " + (i+1));
            for(int j = 0; j < 4; j++){
                System.out.print("Disciplina " + (j+1) + ":");
                notas[i][j] = teclado.nextDouble();
            }
        }

        for(int j = 0; j < 4; j++){

            double maiorNota = notas[0][j];
            double menorNota = notas[0][j];

            for(int i = 1; i < 3; i++){

                if(notas[i][j] > maiorNota){
                    maiorNota = notas[i][j];
                }

                if(notas[i][j] < menorNota){
                    menorNota = notas[i][j];
                }
            }

            System.out.println("\nDisciplina " + (j+1));
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
        }
    }

}
