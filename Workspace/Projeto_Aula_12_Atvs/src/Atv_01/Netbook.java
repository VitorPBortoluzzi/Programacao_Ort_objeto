package Atv_01;

import java.util.Scanner;

public class Netbook extends Computador {
	Netbook(String marca){
		this.marca = marca;
		setModelo("Portátil");
	}
	
	public String exibeMarca() {
		return marca;
	}
	
	public static void main(String[] args) {
		Notebook n;	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Deseja inserir a marca? (S/N)");
		String opcao = teclado.nextLine();
		if(opcao.equals("S")) {
			System.out.println("Informe a marca: ");
			String marca = teclado.nextLine();
			n = new Notebook(marca);
			
		} n = new Notebook(null);
		
		System.out.println("Marca " + n.exibeMarca());
	}
	
	
}
