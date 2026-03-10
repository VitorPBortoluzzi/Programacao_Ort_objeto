import java.util.Scanner;

public class Parte_01_8 {
    //TODO: 8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cidade;
        do{
            System.out.println("Digite o nome de uma cidade");
            cidade = teclado.nextLine();

        } while (!cidade.equals("Sao Paulo"));
    }
}
