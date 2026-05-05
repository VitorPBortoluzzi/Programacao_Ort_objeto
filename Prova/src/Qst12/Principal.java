package Qst12;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
			
			Aluno[] Alunos = new Aluno[10];
			int index = 0;
			int id = 0;
			Scanner teclado = new Scanner(System.in);
			int opcao;
			
			do{
				
				System.out.println("----Menu-----");
				System.out.println("1 - Criar aluno informando nome e nota;");
				System.out.println("2 - Exibir informações do aluno;");
				System.out.println("3 - Atribuir nota;");
				System.out.println("4 - Obter nota;");
				System.out.println("5 - Atribuir nome;");
				System.out.println("6 - Obter nome;");
				System.out.println("7 - Verificar aprovação;");
				System.out.println("0 - Sair");
				
				System.out.print("Opção: ");
				opcao = teclado.nextInt();
				switch (opcao) {
				case 1:
					teclado.nextLine();
					System.out.println("Criação de Aluno ["+(index)+"]:");
					System.out.print("Informe o nome: ");
					String nome = teclado.nextLine();
					System.out.print("Informe a nota: ");
					double nota_a = teclado.nextDouble();
					Alunos[index] = new Aluno(nome,nota_a);
					index +=1;
					break;
				
				case 2:
					System.out.print("Insira o id do aluno[1-" +(index)+"]: ");
					id = teclado.nextInt()-1;
					Alunos[id].exibirInformacoes();
					break;
				
				case 3:
					System.out.print("Insira o id do aluno[1-" +(index)+"]: ");
					id = teclado.nextInt()-1;
					System.out.print("Nota atual: "+ Alunos[id].getNota());
					System.out.println("Informe a nota a atribuir: ");
					double nota_b = teclado.nextDouble();
					Alunos[id].setNota(nota_b);
					break;
					
				case 4:
					System.out.print("Insira o id do aluno[1-" +(index)+"]: ");
					id = teclado.nextInt()-1;
					System.out.print("Nota atual: "+ Alunos[id].getNota());
					
					break;
	
				case 5:
					
					System.out.print("Insira o id do aluno[1-" +(index)+"]: ");
					id = teclado.nextInt()-1;
					System.out.println("Nome atual: " + Alunos[id].getNome());
					teclado.nextLine();
					System.out.println("Informe o nome a atribuir: ");
					String nome_b = teclado.nextLine();
					Alunos[id].setNome(nome_b);
					break;
					
				case 6:
					teclado.nextLine();
					System.out.print("Insira o id do aluno[1-" +(index)+"]: ");
					id = teclado.nextInt()-1;
					System.out.print("Nome: "+Alunos[id].getNome());
					
					break;
					
				case 7:
					teclado.nextLine();
					System.out.print("Insira o id do aluno[1-" +(index)+"]: ");
					id = teclado.nextInt()-1;
					System.out.print("Situação: ");
					Alunos[id].aprovado();
				
				// case 0:
				// 	System.exit(0);
				// EM caso de while usar para encerrar while(true)
					
				default:
					break;
				}
			}
			while(opcao != 0);
			
		}
}
