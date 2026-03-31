package tarefa_01;

public class Principal {

	public static void main(String[] args) {

		Produto prod = new Produto();
		
		System.out.println(prod);
		prod.nome = "Teste";
		prod.qtd = 5;
		prod.preco = 5.0;
		System.out.println(prod.calcularValorTotalEstoque());
		System.out.println(prod.temEstoque());
		prod.adicionarEstoque(25);
		System.out.println(prod);
		prod.vender(35);
		System.out.println(prod);
		
	}

}
