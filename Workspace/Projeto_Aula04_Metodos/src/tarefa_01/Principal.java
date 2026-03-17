package tarefa_01;

import java.util.Scanner;

public class Principal {
	//todo) Crie uma classe Disciplina que contenha os atributos (nome, carga horária e nome do professor) e os métodos de atribuir e recuperar esses valores. Mostre na tela:
//	a) O conteúdo original dos atributos
//	b) A opção para o usuário inserir os valores
//	c) A exibição do novo conteúdo dos atributos
	public static void main(String[] args) {
		Disciplina d = new Disciplina();
		System.out.println("Valores Originais" + d);
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		System.out.println("Deseja inserir os valores: Não (0) | Sim (1) ");
		opcao = teclado.nextInt();
		teclado.nextLine();
		if (opcao == 1) {
			System.out.print("Digite o nome da Disciplina: ");
			d.nome = teclado.nextLine();
			System.out.print("Digite o valor de Carga Horaria: ");
			d.Carg_horar = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Digite o nome do Professor responsável: ");
			d.nome_prof = teclado.nextLine();
			
			System.out.println(d);
			System.out.println(d.retornaNome() + " " + d.retornCarga_hor() + "h " + d.retornaNome_professor());
		
		}
	}

}
