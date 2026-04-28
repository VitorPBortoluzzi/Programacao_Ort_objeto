package pkg_4;

public class Desenho {
	protected String nomeAutor;

//	public Desenho() {}
	
	public Desenho(String nomeAutor) {
		setNomeAutor(nomeAutor);
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
}
