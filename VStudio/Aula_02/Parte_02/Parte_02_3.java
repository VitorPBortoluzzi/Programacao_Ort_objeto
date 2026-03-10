import java.util.Scanner;

public class Parte_02_3 {
    //TODO: 3 - Escreva um programa Java que use um vetor para ler as notas de 5 alunos e depois calcule e imprima a média das notas.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notas[] = new float[5];
        int soma = 0;

        for(int i = 0; i <= 5; i++){
            System.out.println("Informe a nota do Aluno: ");
            notas[i] = teclado.nextFloat();
            soma += notas[i];
        }

        float media = soma / 5;
        System.out.println("A média das notas é: " + media);

    }
}
