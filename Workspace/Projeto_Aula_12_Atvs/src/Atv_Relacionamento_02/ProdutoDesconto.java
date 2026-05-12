package Atv_Relacionamento_02;

//2 - Crie uma classe Produto com os atributos nome e preco. Em outra classe, crie
//um método criarProdutoDesconto(String nome, double preco) que retorna um objeto
//Produto com 10% de desconto aplicado ao preço.

public class ProdutoDesconto {

	public Produto criarProdutoDesconto(String nome, double preco) {
		double precoComDesconto = preco * 0.9;
		
		return new Produto(nome,precoComDesconto);
	}
	
	public static void main(String[] args) {

        ProdutoDesconto pd = new ProdutoDesconto();

        Produto p = pd.criarProdutoDesconto("Notebook", 3000);

        System.out.println(p.getNome());
        System.out.println(p.getPreco());
    }
}
