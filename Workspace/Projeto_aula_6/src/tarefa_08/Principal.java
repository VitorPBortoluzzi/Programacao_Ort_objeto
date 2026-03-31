package tarefa_08;

public class Principal {
	   public static void main(String[] args) {
	        
	        // Criando filmes para teste
	        Filme filme1 = new Filme("Vingadores: Ultimato", 181, 12);
	        Filme filme2 = new Filme("Deadpool", 108, 18);
	        
	        // Testando métodos do filme1
	        System.out.println("=== FILME 1 ===");
	        System.out.println("Descrição: " + filme1.descricaoFilme());
	        System.out.println("Duração em horas: " + filme1.converterDuracaoHoras());
	        System.out.println("Pode assistir (idade 10)? " + filme1.podeAssistir(10));
	        System.out.println("Pode assistir (idade 15)? " + filme1.podeAssistir(15));
	        
	        // Testando métodos do filme2
	        System.out.println("\n=== FILME 2 ===");
	        System.out.println("Descrição: " + filme2.descricaoFilme());
	        System.out.println("Duração em horas: " + filme2.converterDuracaoHoras());
	        System.out.println("Pode assistir (idade 16)? " + filme2.podeAssistir(16));
	        System.out.println("Pode assistir (idade 20)? " + filme2.podeAssistir(20));
	    }
}
