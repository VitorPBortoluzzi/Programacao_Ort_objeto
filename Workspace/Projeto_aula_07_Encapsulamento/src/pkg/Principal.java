package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ricardo",-40);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		
		System.out.print("Digite o novo nome: ");
		p.setNome(teclado.nextLine());
		System.out.print("Digite a nova idade: ");
		p.setIdade(teclado.nextInt());
		System.out.println(p.getNome() + "|" + p.getIdade());
	}
	
}
