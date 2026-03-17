package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Carro_const c = new Carro_const("VW","Gol");
		System.out.println("Marca do carro: " + c.marca);
		System.out.println("Modelo do carro: " + c.modelo);
		
		String marca, modelo;
		System.out.print("Digite a marca do carro: ");
		marca = teclado.nextLine();
		System.out.print("Digite o modelo do carro: ");
		modelo = teclado.nextLine();
		
		Carro_const c2 = new Carro_const(marca,modelo);
		System.out.println("Marca do carro2: " + c2.marca);
		System.out.println("Modelo do carro2: " + c2.modelo);

		System.out.print("Digite a marca e modelo do carro: ");
		Carro_const c3 = new Carro_const(teclado.nextLine(),teclado.nextLine());
		System.out.println("Marca do carro 3: " + c3.marca);
		System.out.println("Modelo do carro 3: " + c3.modelo);
		
		Carro_const c4 = new Carro_const("Ford");
		System.out.println("Marca do carro 4: " + c4.marca);
		
		teclado.close();
	}

}
