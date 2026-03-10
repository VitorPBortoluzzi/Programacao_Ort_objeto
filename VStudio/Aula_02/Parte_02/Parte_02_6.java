import java.util.Scanner;

public class Parte_02_6 {
    //TODO: 6 - Escreva um programa Java que use um vetor para ler os nomes de 5 cidades e outro vetor para armazenar as suas 
    // respectivas populações e depois imprima na tela o nome da cidade mais populosa.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] cidades = new String[5];
        int[] populacos = new int[5];

        int maior = -2147483647;
        int indexMaior = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o nome da cidade " + (i+1) + ":");
            cidades[i] = teclado.nextLine();

            System.out.println("Digite a população da cidade " + (i+1) + ":");
            populacos[i] = teclado.nextInt();

            if (populacos[i] > maiorPop){
                maior = populacos;
                indexMaior = i;
            }
        }
        System.out.println("Cidade mais Populosa: " + cidades[indexMaior] + " com população de: " + maiorPop);
    }
}
