package tar_05;

public class Produto {
	public String nome;
	public float preco;
	public int qtdEstoque;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome +
				"\nPreço: " + preco +
				"\nqtdEsoque: " + qtdEstoque + "\n";
	}
}
