public class Parte_01_4 {
    //TODO: 4 - Escreva um programa Java que use um laço para somar os números de 1 a 100.
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 100; i++){
            soma += i;
        }
        System.out.println("soma total é: " + soma);
    }
}
