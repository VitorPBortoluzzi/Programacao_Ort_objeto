package pkg;

import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Professor p1 = new Professor();
		Laboratorio l1 = new Laboratorio();
		
		System.out.println("Nome do Professor: ");
		p1.nome = teclado.nextLine();
		System.out.println("Local: ");
		l1.local = teclado.nextLine();
		
		System.out.println("Professor: " + p1.nome + " && Local: " + l1.local);
		

	}

}
