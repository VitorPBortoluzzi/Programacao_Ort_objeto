package Atividade_02;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//TODO Crie uma classe Circulo que possua o atributo raio. Proteja o atributo
		//	utilizando encapsulamento. Crie os métodos get e set para o atributo. Crie
		//	um método calculaArea que calcule a área do círculo e retorne o resultado.
		//	Faça leitura pelo teclado dos valores.
		Circulo c = new Circulo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o raio do circulo: ");
		c.setRaio(sc.nextDouble());
		System.out.println("Área do circulo: " + c.calculeArea());
		System.out.println("Área do circulo: " + c.calcArea());
	}
}
