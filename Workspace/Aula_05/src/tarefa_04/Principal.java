package tarefa_04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	public static void main(String[] args) {
		// TODO 4 - Crie um array de Strings com 5 nomes de pessoas (ex: "Ana", "Carlos", etc.). Peça ao usuário para digitar um número de 0 a 4 para ver quem está naquela posição. 
		//Trate a exceção caso o usuário digite um índice que não existe (ex: 10 ou -1), usando ArrayIndexOutOfBoundsException. Trate também se ele digitar uma letra.
		//String[] nome = new String[5];
		String[] nomes = {"Ana", "Carlos", "João", "Maria", "Pedro"};
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um numero de 0 a 4: ");
		try {
			int num = teclado.nextInt();
			System.out.println("Nome na posição " + num + " : " + nomes[num]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Valor fora dos parametros, digite um numero de 0 a 4!!");
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Informe apenas numeros!!");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}

}
