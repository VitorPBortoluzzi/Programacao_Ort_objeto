package Atividade_01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria cb = new ContaBancaria(0,2000);
		System.out.println("Saldo: " + cb.getSaldo() + " | Limite: " + cb.getLimite());
		System.out.print("Quanto deseja sacar: ");
		cb.sacar(teclado.nextDouble());
		System.out.println("Saldo: " + cb.getSaldo() + " | Limite: " + cb.getLimite());
		System.out.println("Deposito de 500");
		cb.depositar(500);
		System.out.println("Saldo: " + cb.getSaldo() + " | Limite: " + cb.getLimite());
		System.out.print("Quanto deseja sacar: ");
		cb.sacar(teclado.nextDouble());
		System.out.println("Saldo: " + cb.getSaldo() + " | Limite: " + cb.getLimite());
	}
}
