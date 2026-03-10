package tar_06;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.println("Insira os dados do aluno: ");
		System.out.print("Nome: ");
		a1.nome = teclado.nextLine();
		
		System.out.print("Matricula: ");
		a1.matricula = teclado.nextLine();
		
		System.out.print("Nota 01: ");
		a1.nota1 = teclado.nextInt();
		System.out.print("Nota 02: ");
		a1.nota2 = teclado.nextInt();
		System.out.print("Nota 03: ");
		a1.nota3 = teclado.nextInt();
		
		
		System.out.println(a1);
		float media = (a1.nota1+a1.nota2+a1.nota3)/3;
		System.out.println("Média das notas é: " + media);
		if(media >= 6) {
			System.out.println("Aluno aprovado");
		}
		if (media < 6) {
			System.out.println("Aluno Reprovado");
		}
	}
}
