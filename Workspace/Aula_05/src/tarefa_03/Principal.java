package tarefa_03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO 3 – Faça o tratamento de exceções em conversões de valores lidos pelo teclado. Por exemplo, ao ler uma string e converter ela para double.
		Scanner teclado = new Scanner(System.in);
		String linha = teclado.nextLine();
		double numeroLinha;
		try {
			numeroLinha = Double.parseDouble(linha);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Informe numeros!!");
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
