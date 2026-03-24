package tarefa_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//TODO 6 - Escreva um programa que tenha um valor fixo de premiação (ex: double premio = 5000.0). Peça ao usuário para digitar quantos ganhadores dividirão esse prêmio.
		//Tratamento 1: Use ArithmeticException para o caso de o usuário digitar 0 (divisão por zero).
		//Tratamento 2: Use InputMismatchException para garantir que ele digitou um número inteiro.
		double premio = 5000.0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas pessoas irão dividir o premio de " + premio + " ?");
		try {
			int num = teclado.nextInt();
			System.out.println(premio / num);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divisão por 0, impossivel!");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("0.# n é uma pessoa");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
