package Atividade_02;

public class Circulo {
	//TODO Crie uma classe Circulo que possua o atributo raio. Proteja o atributo
	//	utilizando encapsulamento. Crie os métodos get e set para o atributo. Crie
	//	um método calculaArea que calcule a área do círculo e retorne o resultado.
	//	Faça leitura pelo teclado dos valores.
	private double raio;
	static double pi = 3.14159265358979323846;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double calculeArea() {
		return (pi * (raio * raio));
	}
}
