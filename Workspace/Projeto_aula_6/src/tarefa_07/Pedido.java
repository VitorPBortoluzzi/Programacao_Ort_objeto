package tarefa_07;

public class Pedido {
//TODO Crie uma classe chamada Pedido com os atributos numero, produto, preco e quantidade. Crie um construtor que inicialize esses atributos. 
//	Implemente os métodos 
//	calcularSubtotal(), que retorna o valor total do pedido (preço multiplicado pela quantidade), 
//	calcularDesconto(double percentual), que retorna o valor do desconto aplicado ao subtotal, 
//	calcularTotal(double percentualDesconto), que retorna o valor final do pedido após o desconto, e 
//	resumoPedido(), que retorna uma string com as informações principais do pedido.
	
	public int numero;
	public String produto;
	public double preco;
	public double qtd;
	
	public Pedido(int numero, String prod, double p, double q) {
		this.numero = numero;
		this.produto = prod;
		this.preco = p;
		this.qtd = q;
	}
	
	public double calcularSubtotal() {
		return preco * qtd;
	}
	
	public double calcularDesconto(double percentual) {
		double subTotal = calcularSubtotal();
		double desconto = subTotal * (percentual /100);
		return desconto;
	}
	
	public double calcularTotal(double percentualDesconto) {
		double total = (calcularSubtotal() - calcularDesconto(percentualDesconto));
		return total;
	}
	
	public String resumoPedido() {
		return "Numero: " + numero + " Produto: " + produto + " Preço: " + preco + " Quantidade: " + qtd;
	}
}
