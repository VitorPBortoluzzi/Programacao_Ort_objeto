package pkg;

public class Carro_const {
	public String marca;
	public String modelo;
	
	public Carro_const(String marcaCarro, String modeloCarro) {
		System.out.println("Estou no construtor");
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public Carro_const(String marca) {
		System.out.println("Estou no construtor");
		this.marca = marca;
	}
}
