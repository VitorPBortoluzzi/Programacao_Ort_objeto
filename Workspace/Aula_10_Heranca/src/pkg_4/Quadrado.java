package pkg_4;

public class Quadrado extends desenho2D{
	protected String dsc;
	
	public Quadrado(double altura, double largura, String dsc, String nomeAutor) {
		super(altura, largura,nomeAutor);
		setDsc(dsc);
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
	
	public void exibirDados() {
		System.out.println("Largura: " + largura);
		System.out.println("Altura: " + altura);
		System.out.println("Descrição: " + dsc);
		System.out.println("Autor: " + nomeAutor);
	}
	
}
