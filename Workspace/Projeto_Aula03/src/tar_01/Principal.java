package tar_01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		System.out.println("Digite a marca: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o ano fabricação: ");
		c1.anoFabricacao = teclado.nextLine();
		
		System.out.println(c1);
		
		Carro c2 = new Carro();
		System.out.println("Digite a marca: ");
		c2.marca = teclado.nextLine();
		System.out.println("Digite o modelo: ");
		c2.modelo = teclado.nextLine();
		System.out.println("Digite o ano fabricação: ");
		c2.anoFabricacao = teclado.nextLine();
		
		System.out.println(c2);
	}

}
