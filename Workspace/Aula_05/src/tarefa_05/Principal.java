package tarefa_05;

import java.util.Scanner;

public class Principal {
//TODO 5 - Escreva um programa que leia uma temperatura em String do teclado (ex: "25.5") e a converta para double para realizar um cálculo (ex: converter para Fahrenheit). 
	//Use Double.parseDouble() para a conversão. Trate a exceção NumberFormatException, que ocorre se o usuário digitar algo como "25,5" (com vírgula) ou "vinte graus", impedindo a conversão.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Digite uma temperatura em Cº");
			String temp = teclado.nextLine();
			double temperatura = Double.parseDouble(temp);
			double Fa = ((temperatura * 1.8)+32);
			System.out.println("Temperatura em Fahrenheit: " + Fa);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Digite numeros decimais com '#.##'");
		}
	}
}
