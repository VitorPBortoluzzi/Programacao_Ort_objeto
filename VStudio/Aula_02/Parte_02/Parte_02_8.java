import java.util.Scanner;

public class Parte_02_8 {
    public static void main(String[] args) {
        //TODO:8 - Escreva um programa Java que use um vetor para armazenar 10 números inteiros lidos do usuário e 
        // depois imprima na tela quantos números são pares e quantos são ímpares.

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] numerosPares = new int[10]; int indexPar = 0;
        int[] numerosImpares = new int[10]; int indexImpar = 0;

        System.out.println("Informe os 10 Dígitos: ");
        for(int i = 0; i < 10; i++){
            numeros[i] = teclado.nextInt();
            if (numeros[i] % 2 == 0){
                numerosPares[indexPar] = numeros[i];
                indexPar++;
            } else {numerosImpares[indexImpar] = numeros[i]; indexImpar++;}
        }

        System.out.print("Os numeros foram: ");
        System.out.print("Numeros: ");
        for(int i = 0; i < 10; i++){
            if(i < 9){
                System.out.print(numeros[i] + ",");
            } else System.out.println(numeros[i] + ";");
        }
        System.out.println("\nNumero de Pares: " + (indexPar));

        System.out.print("Numeros Pares: ");
        for(int i = 0; i < indexPar; i++){
            if(i < 9){
                System.out.print(numerosPares[i] + ",");
            } else System.out.println(numerosPares[i] + ";");
        }
        System.out.println("Numero de Impares: " + (indexImpar));
        System.out.print("Numeros Impares: ");
        for(int i = 0; i < indexImpar; i++){
            if(i < 9){
                System.out.print(numerosImpares[i] + ",");
            } else System.out.println(numerosImpares[i] + ";");
        }
    }
}
