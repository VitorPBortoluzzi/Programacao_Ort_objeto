package tarefa_03;

public class Principal {
	public static void main(String[] args) {
        // Criando um aluno para teste
        Aluno aluno1 = new Aluno("João", 7.5, 8.0, 6.5);

        // Exibindo resultados
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Aprovado? " + aluno1.aprovado());
        System.out.println("Maior nota: " + aluno1.maiorNota());
        System.out.println("Menor nota: " + aluno1.menorNota());

        System.out.println("----------------------");

        // Outro teste
        Aluno aluno2 = new Aluno("Maria", 5.0, 6.0, 4.5);

        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Aprovado? " + aluno2.aprovado());
        System.out.println("Maior nota: " + aluno2.maiorNota());
        System.out.println("Menor nota: " + aluno2.menorNota());
	}
}
