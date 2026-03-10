import java.util.Scanner;

public class Parte_01_7 {
    //TODO:7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota;

        do {
            System.out.println("Digite a nota do aluno (!!USE \",\" !! -1 para sair): ");
            nota = teclado.nextFloat();
            System.out.println("Nota registrada: " + nota);
        }
        while (nota != -1);     
    }
}
