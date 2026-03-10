import java.util.Scanner;

public class Parte_01_6 {
    //todo: 6- Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int temp;
        do{
            System.out.println("Informe um valor para o sistema(0 para sair): ");
            temp = teclado.nextInt();

        } while( temp != 0);
        System.out.println("Programa Encerrado");
    }
}
