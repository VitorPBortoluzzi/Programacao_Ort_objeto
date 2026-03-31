package tarefa_09;

public class Principal {
public static void main(String[] args) {
	// Criando livros para teste
    Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256, false);
    Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 310, false);

    // Testando livro1
    System.out.println("=== LIVRO 1 ===");
    System.out.println(livro1.detalhesLivro());
    System.out.println("Disponível? " + livro1.estaDisponivel());

    System.out.println("\nTentando emprestar...");
    boolean emprestado = livro1.emprestar();
    System.out.println("Emprestado com sucesso? " + emprestado);
    System.out.println("Disponível? " + livro1.estaDisponivel());

    System.out.println("\nTentando emprestar novamente...");
    System.out.println("Emprestado com sucesso? " + livro1.emprestar());

    System.out.println("\nDevolvendo livro...");
    livro1.devolver();
    System.out.println("Disponível? " + livro1.estaDisponivel());

    // Testando livro2
    System.out.println("\n=== LIVRO 2 ===");
    System.out.println(livro2.detalhesLivro());
    System.out.println("Disponível? " + livro2.estaDisponivel());

    System.out.println("\nEmprestando livro2...");
    livro2.emprestar();
    System.out.println(livro2.detalhesLivro());
}
}
