package tarefa_07;

public class Principal {
public static void main(String[] args) {
	 // Criando um pedido de teste
    Pedido pedido1 = new Pedido(1, "Notebook", 3500.00, 2);
    
    // Testando os métodos
    double subtotal = pedido1.calcularSubtotal();
    double desconto = pedido1.calcularDesconto(10); // 10%
    double total = pedido1.calcularTotal(10); // 10%
    
    // Exibindo resultados
    System.out.println("=== TESTE DO PEDIDO ===");
    System.out.println("Subtotal: R$ " + subtotal);
    System.out.println("Desconto (10%): R$ " + desconto);
    System.out.println("Total com desconto: R$ " + total);
    
    // Testando resumo
    System.out.println("\nResumo do Pedido:");
    System.out.println(pedido1.resumoPedido());
}
}
