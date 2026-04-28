package Atividade_2;

public class Pessoa {
//TODO 2) Crie uma classe "Pessoa" com um construtor que recebe um parâmetro "nome" e um método "trabalhar" que imprime "A pessoa está trabalhando". 
//	Crie uma subclasse "Funcionario" que herda da classe "Pessoa". No construtor da classe "Funcionario", utilize o comando "super" para chamar o construtor da classe "Pessoa" e passar o parâmetro "nome".
//	Adicione um método "trabalhar" na classe "Funcionario" que imprime "O funcionário está trabalhando".
	
	protected String nome;
	
	public Pessoa(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void trabalhar() {
		System.out.println("A pessoa " + getNome() +" está trabalhando");
	}
}
