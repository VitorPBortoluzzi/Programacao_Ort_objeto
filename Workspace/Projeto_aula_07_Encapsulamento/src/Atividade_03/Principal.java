package Atividade_03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a Base: ");
		double base = sc.nextDouble();
		System.out.print("Informe a Altura: ");
		Retangulo r = new Retangulo(base,sc.nextDouble());
		System.out.println("Area: " + r.calculaArea());
	}
}
