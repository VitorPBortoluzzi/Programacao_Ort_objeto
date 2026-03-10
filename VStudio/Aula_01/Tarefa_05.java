import java.util.Scanner;

public class Tarefa_05 {

	public static void main(String[] args) {
		//TODO: Escreva um algoritmo que leia 3 valores 
		// pelo teclado e então informe qual o maior deles.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o primeiro valor: ");
		int a = teclado.nextInt();

		System.out.println("Informe o segundo valor: ");
		int b = teclado.nextInt();

		System.out.println("Informe o terceiro valor: ");
		int c = teclado.nextInt();

		int maior = -1;

		if (a > maior){
			maior = a;
		}

		if (b > maior){
			maior = b;
		}

		if (c > maior){
			maior = c;
		}

		System.out.println(maior+" é o maior valor");
		//teclado.close(); boa prática
	}

}
