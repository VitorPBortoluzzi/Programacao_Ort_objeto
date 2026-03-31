package tarefa_09;

public class Livro {
////TODO Crie uma classe chamada Livro com os atributos titulo, autor, paginas e emprestado (boolean). Crie um construtor que inicialize os atributos. Implemente os métodos 
//	emprestar(), que marca o livro como emprestado caso esteja disponível e retorna true, 
//	devolver(), que marca o livro como disponível novamente, 
//	estaDisponivel(), que retorna true caso o livro não esteja emprestado, e 
//	detalhesLivro(), que retorna uma string contendo as informações do livro.
	
	public String titulo;
	public String autor;
	public int paginas;
	public boolean emprestado;
	
	public Livro(String titulo, String autor, int paginas, boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.emprestado = emprestado;
	}
	
	public boolean estaDisponivel() {
		if (emprestado == true) {
			return false;
		} return true;
	}
	
	public boolean emprestar() {
		if (estaDisponivel() == true) {
			emprestado = true;
			return true;
		}
		return false;
	}
	
	public void devolver() {
		emprestado = false;
	}
	
	public String detalhesLivro() {
		return "Titulo: " + titulo + " Autor: " + autor + " Paginas: " + paginas + " Emprestado?: " + emprestado;
	}
}
