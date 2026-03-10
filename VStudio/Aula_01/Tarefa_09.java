import java.util.Scanner;

public class Tarefa_09 {
    public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float x,y;
        int opcao;
		
		System.out.println("Digite 2 numeros ( x & y) para realizar as operaçõe smatemáticas básicas: ");
		System.out.println("Digite x: ");
		    x = teclado.nextFloat();
		System.out.println("Digte y: ");
		    y = teclado.nextFloat();
		
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adição: " + (x + y));

                case 2:
                    System.out.println("Subtração: " + ( x - y));
                    break;
                
                case 3:
                    System.out.println("Multiplicação: " + ( x * y));
                    break;
                case 4:
                    if (y != 0){
                        System.out.println("Divisão: " + ( x / y));
                    } else {
                        System.out.println("Não é possivel dividir por ZERO");
                    }
                    break;

                default:
                    break;
            }
        } while (opcao != 0);
    }
    
}//TODO Altere o exercício 1 e faça um menu utilizando switch case
