import java.util.Scanner;

public class Tarefa_07 {
    public static void main(String[] args) {
        //TODO: Escreva um algoritmo que leia dois valores pelo teclado 
        // e informe se os mesmos são múltiplos um do outro ou não.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
            int a = teclado.nextInt();

        System.out.println("Informe o segundo valor: ");
            int b = teclado.nextInt();

        bool eh_multiplo = False;

        if (a % b == 0){ eh_multiplo = True;}

        System.out.println("Os valores são multiplos? " + eh_multiplo);
    }
}
