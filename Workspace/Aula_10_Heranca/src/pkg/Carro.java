package pkg;

public class Carro {
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirMensagem() {
		System.out.println("Estou dentro da classe Carro");
		System.out.println("O Carro é: "+ nome);
	}
}
