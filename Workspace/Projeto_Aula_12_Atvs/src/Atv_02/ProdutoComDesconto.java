package Atv_02;

public class ProdutoComDesconto extends Produto {
	private double descontoProduto = 0.9;
	
	public double desconto() {
		return valor * this.descontoProduto;
	}
	
}
