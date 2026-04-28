package Atividade_1;
//TODO 1) Crie uma classe Figura com os seguintes atributos: cor e preenchido. 
//Em seguida, crie uma classe Retangulo que herda de Figura e adiciona dois atributos: largura e altura. 
//Crie um método na classe Retangulo chamado calcularArea() que retorna a área do retângulo (altura * largura).

public class Figura {
	protected String cor;
	protected boolean preenchido;
	
	public Figura(String cor, boolean preenchido) {
		setCor(cor);
		setPreenchido(preenchido);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isPreenchido() {
		return preenchido;
	}

	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}
	
}
