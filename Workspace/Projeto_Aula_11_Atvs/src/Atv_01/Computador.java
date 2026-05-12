package Atv_01;

public class Computador {
	protected String marca;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String exibeModelo() {
		return modelo;
	}
}
