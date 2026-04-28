package Atividade_1;
//TODO
//Em seguida, crie uma classe Retangulo que herda de Figura e adiciona dois atributos: largura e altura. 
//Crie um método na classe Retangulo chamado calcularArea() que retorna a área do retângulo (altura * largura).


public class Retangulo extends Figura {
	private double largura;
	private double altura;
	
	public Retangulo(String cor, boolean preenchido, double largura, double altura) {
		super(cor, preenchido);
		setLargura(largura);
		setAltura(altura);
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea(double altura, double largura) {
		return altura * largura;
	}
	
	
}
