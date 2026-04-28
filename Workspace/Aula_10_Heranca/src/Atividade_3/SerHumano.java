package Atividade_3;

//3) Crie uma classe chamada Pessoa que herda da classe SerHumano os atributos nome e idade e o método falar. 
//A classe SerHumano também possui herança e herda o atributo tipo e o método andar da classe Animal. 
//Desse modo, crie uma classe Principal para exibir na tela o conteúdo de todos os atributos e realizar a chamada de todos os métodos envolvidos no processo. 
//O método falar retorna a string “Nem todos falam” e o método andar imprime na tela a string “Todos andam, mas o modo é variado”. Solicite ao usuário para informar o nome, a idade e o tipo.
public class SerHumano extends Animal{
	protected String nome;
	protected int idade;
	
	public SerHumano(String tipo,String nome, int idade) {
		super(tipo);
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	protected void falar() {
		System.out.println("Nem todos falam");
	}
	

}
