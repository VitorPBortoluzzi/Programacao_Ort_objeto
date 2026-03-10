package tar_05;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Produto 1:");
		Produto p1 = new Produto();
		System.out.println("Nome: ");
		p1.nome = teclado.nextLine();
		System.out.println("Preço: ");
		p1.preco = teclado.nextFloat();
		System.out.println("Qtd em estoque: ");
		p1.qtdEstoque = teclado.nextInt();
		
		
		System.out.print(p1);
		System.out.println("Valor total em estoque: "+ (p1.qtdEstoque * p1.preco));
	}
}
