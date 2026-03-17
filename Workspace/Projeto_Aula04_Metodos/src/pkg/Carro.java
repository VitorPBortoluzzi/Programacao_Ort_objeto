package pkg;

public class Carro {
	public String marca;
	public String modelo;
	
	public void Alugar() {
		System.out.println("O Carro de marca: "+ marca + " & Modelo: " + modelo +" foi alugado;");
	}
	
	public void Devolver() {
		System.out.println("O Carro de marca: "+ marca + " & Modelo: " + modelo +" foi devolvido;");
	}
	
	public void receberDados(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void exibirDados() {
		System.out.println("Marca: "+ marca + " & Modelo: " + modelo);
	}
	
	public String exibirMarca() {
		return marca;
	}
	
	public String exibirModelo() {
		return modelo;
	}
	

	
	@Override
	public String toString() {

		return "Marca: " + marca +
				" & Modelo: " + modelo;
	}
}
