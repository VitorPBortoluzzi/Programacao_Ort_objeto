package pkg;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Apreentação syntax inicial Java"); int idade; idade = 23;
		 * // System.out.printf("A idade é %d \n", idade);
		 * System.out.println("A idade é igual a " + idade);
		 * System.out.println("O individuo tem " + idade + " anos");
		 * 
		 * char c = 'r'; System.out.println("O char é " + c); float f = 3.14f;
		 * System.out.println("O float é " + f); double d = 3.141592;
		 * System.out.println("O double é " + d);
		 */

		Scanner teclado = new Scanner(System.in);

//		String nome = "";
//		System.out.println("Digite o nome: ");
//		nome = teclado.nextLine();
//		System.out.println("O nome é " + nome);
//		
//		int i;
//		System.out.println("Digite um numero inteiro: ");
//		i = teclado.nextInt();
//		System.out.println("Idade é: "+ i);

//		float f;
//		System.out.println("Digite um numero float: ");
//		System.out.println("O numero double é: " + (f = teclado.nextFloat()));
//
//		double d;
//		System.out.println("Digite um numero double: ");
////		d = teclado.nextDouble();
//		System.out.println("O numero double é: " + (d = teclado.nextDouble()));

//		int i;
//		System.out.println("Digite um numero inteiro: ");
//		i = teclado.nextInt();
//		System.out.println("Idade é: " + i);
//		
//		if (i > 18) {
//			System.out.println("Maior de Idade");
//		} else {
//			System.out.println("Menor de Idade");
//		}

		int opcao;
		System.out.println("Digite uma opção: ");
		System.out.println("Digite 1 para cadastrar:");
		System.out.println("Digite 2 para consultar:");
		System.out.println("Digite 3 para sair:");
		opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Aqui vou cadastar: ");
			break;
		case 2:
			System.out.println("Aqui vou consultar: ");
			break;
		case 3:
			System.out.println("Saindo do sistema; ");
			break;

		default:
			break;

		}
	}

}
