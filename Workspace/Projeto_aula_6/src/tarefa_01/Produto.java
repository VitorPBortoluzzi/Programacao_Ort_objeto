package tarefa_01;

public class Produto {
	//V TODO 1 - Crie uma classe chamada Produto com os atributos nome, preco e quantidade. Crie um construtor que inicialize esses atributos. 
	//V Implemente os métodos calcularValorTotalEstoque(),  que deve retornar o valor total do estoque (preço multiplicado pela quantidade), 
	//V temEstoque(), que retorna true se a quantidade for maior que zero, 
	//V adicionarEstoque(int quantidade), que adiciona produtos ao estoque, e 
	//V vender(int quantidade), que diminui a quantidade em estoque apenas se houver produtos suficientes, retornando true caso a venda seja realizada e false caso contrário.
	
	public String nome;
	public double preco;
	public int qtd;
	
	public Produto() {
		nome = "Desconhecido";
		preco = 0.00;
		qtd = 0;
	}
	
	public double calcularValorTotalEstoque() {
		return preco * qtd;
	}
	
	public boolean temEstoque() {
		if(qtd > 0) {
			return true;
		}else return false;
	}
	
	public void adicionarEstoque(int quantidade) {
		this.qtd = qtd+ quantidade;
	}
	
	public boolean vender(int quantidade) {
		if (qtd < quantidade) {
			System.out.println("Estoque insuficiente para venda");
			return false;
		} else {
			this.qtd = qtd - quantidade;
			return true;
			}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto: " + nome +
				" Preço: " + preco +
				" Quantidade: " + qtd;
				
	}
}
