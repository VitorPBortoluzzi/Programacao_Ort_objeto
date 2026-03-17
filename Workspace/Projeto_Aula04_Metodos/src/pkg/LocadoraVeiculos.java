package pkg;

import java.util.Scanner;

public class LocadoraVeiculos {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.receberDados("VW", "Gol");
		System.out.println("Dados do Carro: " + c.exibirMarca() + " " + c.exibirModelo());
		
		
		Scanner teclado = new Scanner(System.in);
		String c_marca, c_modelo;
		System.out.println("Informe a Marca do Carro: ");
		c_marca = teclado.nextLine();
		System.out.println("Informe o Modelo do Carro: ");
		c_modelo = teclado.nextLine();
		
		c.receberDados(c_marca, c_modelo);


		String m_marca, m_modelo;
		int m_cilindradas;
		
		Moto[] Motos = new Moto[2];
		for( int i = 0; i < 2; i++) {
			Motos[i] = new Moto();
			System.out.print("Informe a Marca da Moto: ");
			m_marca = teclado.nextLine();
			System.out.print("Informe o Modelo da Moto: ");
			m_modelo = teclado.nextLine();
			System.out.print("Informe as Cilindradas da Moto: ");
			m_cilindradas = teclado.nextInt();
			teclado.nextLine();
			Motos[i].atribuirValores(m_marca, m_modelo, m_cilindradas);
		}
		System.out.println("Dados do Carro: ");
		System.out.println("Marca: " + c.exibirMarca() + " | Modelo: " + c.exibirModelo());
		for ( int i = 0; i < 2; i++) {
			System.out.println("Marca: " + Motos[i].retornarMarca() + ", Modelo: "+  Motos[i].retornarMod() + ", Cil: " + Motos[i].retornarCil());
			//System.out.println(Motos[i]);
		}
		

		teclado.close();
	}
}
