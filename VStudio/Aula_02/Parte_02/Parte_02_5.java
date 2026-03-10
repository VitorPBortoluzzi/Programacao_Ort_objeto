import java.util.Scanner;

public class Parte_02_5 {
    //TODO:5 - Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        int maior = -2147483647, menor = 2147483647;

        System.out.println("Informe 10 valores inteiros: ");
        for(int i = 0; i < 10; i++){
            System.out.println("Numero: " + (i+1));
            numeros[i] = teclado.nextInt();
            if (maior < numeros[i]){maior = numeros[i];}
            if (menor > numeros[i]){menor = numeros[i];}
        }

        System.out.println("Maior: "+ maior + " & Menor: " + menor);

    }
}
