package pkg_tarefas;

import java.util.Scanner;

public class Tarefa_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO 2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$4,90, escreva um algoritmo para ler a marcação do odômetro (marcador de quilometragem) no início do dia, 
		//a marcação no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.
		
		Scanner teclado = new Scanner(System.in);
		
		float odometro_inicio,odometro_fim,litros,valor_corridas;
		float combustivel = 4.90f;
		
		System.out.println("Sistema para calculo de rendimento: ");
		System.out.print("Informe o valor do odometro inicial: ");
		odometro_inicio = teclado.nextFloat();
		System.out.print("Informe o valor do odometro final: ");
		odometro_fim = teclado.nextFloat();
		System.out.print("Informe a quantidade de Gasolina gasta: ");
		litros = teclado.nextFloat();
		System.out.print("Informe a quantidade de Recebida: ");
		valor_corridas = teclado.nextFloat();
		
		float total_quilometragem = odometro_fim - odometro_inicio;
		float media_do_consumo = total_quilometragem/litros;
		float lucro = (litros * combustivel) - valor_corridas;
		
		System.out.println("\t ------------");
		System.out.println("Média de consumo(Km/l): " + media_do_consumo);
		System.out.println("Lucro Líquido: " + lucro);
		
		
	}

}
