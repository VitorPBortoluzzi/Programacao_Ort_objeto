package Atividade_04;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os atributos do carro: ");
		String marca;
		String modelo;
		System.out.print("Marca:");
		marca = sc.nextLine();
		System.out.print("Modelo: ");
		modelo = sc.nextLine();
		System.out.print("Ano: ");
		Carro c = new Carro(marca,modelo,sc.nextInt());
		
		System.out.println("Carro: " + c.exibeDetalhes());
	}
}
