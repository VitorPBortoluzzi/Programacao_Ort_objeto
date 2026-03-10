package tar_02;

import java.util.Scanner;

public class Principal extends Computador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Computador c1 = new Computador();
		Computador c2 = new Computador();
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Marca: ");
		c1.marca = teclado.nextLine();
		System.out.print("Modelo: ");
		c1.modelo = teclado.nextLine();
		System.out.print("Tipo: ");
		c1.tipo = teclado.nextLine();
		System.out.print("Preço: ");
		c1.preco = teclado.nextFloat();
		
		c2.marca = "CCE";
		c2.modelo = "AX541";
		c2.tipo = "Notebook";
		c2.preco = 3.500f;
		
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
