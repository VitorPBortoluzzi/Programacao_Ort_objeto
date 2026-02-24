package pkg_tarefas;

import java.util.Scanner;

public class Tarefa_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TODO -> 1 - Faça um programa para leitura de dois números e após faça as quatro operações matemáticas (Soma, Subtração, Multiplicação e divisão)
		Scanner teclado = new Scanner(System.in);
		float x,y;
		
		System.out.println("Digite 2( x & y) numeros para realizar as operaçõe smatemáticas básicas: ");
		System.out.println("Digite x: ");
		x = teclado.nextFloat();
		System.out.println("Digte y: ");
		y = teclado.nextFloat();
		
		System.out.println("Operações: ");
		System.out.println("Adição: " + (x + y));
		System.out.println("Subtração: " + ( x - y));
		System.out.println("Multiplicação: " + ( x * y));
		System.out.println("Divisão: " + ( x / y));
		
	}

}
