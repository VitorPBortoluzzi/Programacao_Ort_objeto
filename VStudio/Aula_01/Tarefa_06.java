import java.util.Scanner;

public class Tarefa_06 {
//TODO: Ajuste o exercício 5 de maneira que mostre os valores informados em ordem crescente.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

            System.out.println("Informe o primeiro valor: ");
            int a = teclado.nextInt();

            System.out.println("Informe o segundo valor: ");
            int b = teclado.nextInt();

            System.out.println("Informe o terceiro valor: ");
            int c = teclado.nextInt();

            int temp;

            if (a > b){
                temp = a;
                a = b;
                b = temp;
            }

            if (a > c){
                temp = a;
                a = c;
                c = temp;
            }

            if (b > c){
                temp = b;
                b = c;
                c = temp;
            }

            System.out.println("Valores em ordem crescente: " + a + " " + b + " " + c +";");
            //teclado.close(); boa prática
    }
}