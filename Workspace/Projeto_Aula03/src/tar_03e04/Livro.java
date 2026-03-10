package tar_03e04;

public class Livro {
	public String titulo;
	public String autor;
	public String anoPublicacao;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: " + titulo +
				"\nAutor: " + autor +
				"\nAno de Publicação: " + anoPublicacao + "\n";
	}
	public static void main(String[] args) {
		Livro l1 = new Livro();
		System.out.println(l1);
	}
}
