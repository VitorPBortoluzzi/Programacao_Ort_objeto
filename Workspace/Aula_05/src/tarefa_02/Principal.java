package tarefa_02;
import java.util.Scanner;

public class Principal {


	
	public static void main(String[] args) {
		// TODO 2 – Faça o tratamento de exceções em uma calculadora.
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("Digite uma opção: ");
			System.out.println("Digite 1 para somar:");
			System.out.println("Digite 2 para subtrair:");
			System.out.println("Digite 3 para multiplicar:");
			System.out.println("Digite 4 para dividir");
			System.out.println("Digite -1 para sair\n");
			try {
				System.out.print("Opção: ");
				opcao = teclado.nextInt();
				if (opcao == -1) {
					break;
				}
				
				System.out.print("Valor A: ");
                int a = teclado.nextInt();

                System.out.print("Valor B: ");
                int b = teclado.nextInt();
				
				switch (opcao) {
				case 1:
					System.out.println("\nResultado:" + (a+b));
					break;
				case 2:
					System.out.println("Resultado:" + (a-b));
					break;
				case 3:
					System.out.println("Resultado:" + (a*b));
					break;
				case 4:
                    try {
                        System.out.println("Resultado: " + (a / b));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: divisão por zero não é permitida!");
                    }
                    break;

				default:
					System.out.println("Opção inválida!");

				}
			} catch (Exception  e) {
				System.out.println(e);
				System.out.println("Erro: digite apenas números!");
                teclado.nextLine(); // limpa entrada inválida
			}
			
			
		} while (opcao != -1);

	}

}
