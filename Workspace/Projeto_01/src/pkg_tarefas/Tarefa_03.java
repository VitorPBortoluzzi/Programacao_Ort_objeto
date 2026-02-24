package pkg_tarefas;

import java.util.Scanner;

public class Tarefa_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO 3 - Escrever um algoritmo para ler quatro valores float, calcular a sua média, e escrever na tela os que são superiores à média.
		
		Scanner teclado = new Scanner(System.in);
		
		float x,y,z,w,media;
		
		System.out.println("Informe 4 valores: ");
		System.out.println("Valor 1: ");
		x = teclado.nextFloat();
		System.out.println("Valor 2: ");
		y = teclado.nextFloat();
		System.out.println("Valor 3: ");
		z = teclado.nextFloat();
		System.out.println("Valor 4: ");
		w = teclado.nextFloat();

		media = (x+y+z+w)/4;
		System.out.println("Média : " + (media));
		
		String maiores = "Maiores do que a média: ";
		if (x > media) {
			maiores = maiores + " " + x ;
		}
		if (y > media) {
			maiores = maiores + " " + y ;
		}
		if (z > media) {
			maiores = maiores + " " + z ;
		}
		if (w > media) {
			maiores = maiores + " " + w ;
		}

		maiores = maiores + ";";
		System.out.println("Valores maiores do que a média: " + maiores);
		
	}

}
