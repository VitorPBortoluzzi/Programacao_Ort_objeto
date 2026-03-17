package tarefa_02;

public class Livro {
	//todo2) Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e Emprestado (bool). Crie método que retorne as informações do livro. 
//	Crie também um método responsável por fazer o empréstimo do livro e outro para fazer a devolução. Faça o controle disto utilizando o atributo Emprestado.
	public String titulo;
	public String autor;
	public String ano_Pub;
	public String genero;
	public boolean emprestado = false;
	
	public String retornaTitulo() {
		return titulo;
	}
	public String retornaAutor() {
		return autor;
	}
	public String retornaAnoPub() {
		return ano_Pub;
	}
	public String retornaGenero() {
		return genero;
	}
	
	public boolean retornaEmprestado() {
		return emprestado;
	}
	
}
