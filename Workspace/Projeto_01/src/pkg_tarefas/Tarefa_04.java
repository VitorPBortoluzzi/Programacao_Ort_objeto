package pkg_tarefas;

import java.util.Scanner;

public class Tarefa_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO 4 - Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe
		// em qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está
		// sobre um dos eixos.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um ponto (x,y): ");
		String ponto = teclado.next();

		String eixos[] = ponto.split(",");
		int x = Integer.parseInt(eixos[0].trim());
		int y = Integer.parseInt(eixos[0].trim());

		
		if (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}
			if (x > 0 && y < 0) {
				System.out.println("Segundo quadrante");
			}
			if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}
			if (x < 0 && y > 0) {
				System.out.println("Quarto quadrante");
			}
		}
		if (x == 0 && y == 0) {
			System.out.println("Ponto \"Zero\"");	
		} 
		if (x == 0 && y != 0) {
			System.out.println("Sobre o eixo X");
		}
		if (x != 0 && y == 0) {
			System.out.println("Sobre o eixo y");
		}
	}

}
