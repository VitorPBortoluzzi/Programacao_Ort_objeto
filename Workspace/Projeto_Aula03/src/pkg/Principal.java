package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
//		int n;
//		Aluno a1 = new Aluno();
//		a1.nome = "Hestevam";
//		a1.matricula = "102030";
//		a1.CPF = "123456789-11";
//		System.out.println("Aluno Instanciado");
//		System.out.println("Nome : " + a1.nome);
//		System.out.println("Matrícula : " + a1.matricula);
//		System.out.println("CPF: " + a1.CPF);
//
//		Aluno a2 = new Aluno();
//		a2.nome = "Leonardo";
//		a2.matricula = "302010";
//		a2.CPF = "119876543-21";
//		System.out.println("\nAluno2 Instanciado");
//		System.out.println("Nome2 : " + a2.nome);
//		System.out.println("Matrícula2 : " + a2.matricula);
//		System.out.println("CPF2: " + a2.CPF);
		
		Scanner teclado = new Scanner(System.in);
		
//		System.out.println("Informe os dados do Aluno: ");
//		Aluno a3 = new Aluno();
//		System.out.print("Nome: ");
//		a3.nome = teclado.nextLine();
//		System.out.print("Matricula: ");
//		a3.matricula = teclado.nextLine();
//		System.out.print("CPF: ");
//		a3.CPF = teclado.nextLine();
		
		Aluno[] alunos = new Aluno[3];
		System.out.println("Informe os dados dos Alunos: ");
		for(int i = 0; i < 3; i++) {
			alunos[i] = new Aluno();
			System.out.println("Aluno " + (i+1) + ":");
			System.out.print("Nome: ");
			alunos[i].nome = teclado.nextLine();
			System.out.print("Matricula: ");
			alunos[i].matricula = teclado.nextLine();
			System.out.print("CPF: ");
			alunos[i].CPF = teclado.nextLine();
			System.out.println("Idade: ");
			alunos[i].idade = teclado.nextInt();
			teclado.nextLine();
		}
		System.out.println("Alunos: ");
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno " + (i+1) + ":\n" + alunos[i]);
		}
	}
}
