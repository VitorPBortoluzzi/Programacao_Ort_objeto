package pkg_2;

import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		Pessoa pessoa;
		
//		Pessoa p = new Pessoa();
//		p.trabalhar();
//		
//		Programador p = new Programador();
//		p1.trabalhar();
		
		System.out.println("Digite 1 para pessoa:");
		System.out.println("Digite 2 para programador");
		Scanner teclado = new Scanner(System.in);
		int op = teclado.nextInt();
		if(op == 1) {
			pessoa = new Pessoa();
			pessoa.trabalhar();
		} else if(op == 2) {
			pessoa = new Programador();
			pessoa.trabalhar();
		}
	}
}
