import java.util.Scanner;

public class Parte_01_5 {
    //TODO: 5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
            int a = teclado.nextInt();
        int temp = 1;

        for (int i = 1;  i <= a; i ++){
             temp =  temp * i;
        }
        System.out.println(" O fatorial de " + a + " é: " + temp);
    }
}
