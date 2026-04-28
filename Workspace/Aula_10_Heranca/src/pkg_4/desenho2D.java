package pkg_4;

public class desenho2D extends Desenho {
	protected double altura;
	protected double largura;
	
	public desenho2D(double altura, double largura, String nomeAutor) {
		super(nomeAutor);
		setAltura(altura);
		setLargura(largura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	
}
