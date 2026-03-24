package tarefa_01;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO 1 - Escreva um programa que solicita ao usuário para digitar um número inteiro e exiba a raiz quadrada desse número. 
		//Certifique-se de que o programa trate adequadamente as exceções se o usuário digitar um valor inválido, por exemplo, ler um char ou string.
		Scanner teclado = new Scanner(System.in);
		int numero;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("Digite um numero inteiro. ao qual deseja verificar a raiz quadrada: ");
		try {
			numero = teclado.nextInt();
			double raizQuadrada = Math.sqrt(numero);
			System.out.println(df.format(raizQuadrada));
		}catch (InputMismatchException e) {
			System.out.println("Tipo de váriavel incorreta, por favor insira um numero inteiro");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
