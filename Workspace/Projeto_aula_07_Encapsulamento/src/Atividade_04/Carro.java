package Atividade_04;

public class Carro {
//TODO 4 - Crie uma classe Carro que possua os atributos marca, modelo e ano.
//	Proteja os atributos utilizando encapsulamento. Crie os métodos get e set
//	para cada atributo. Crie um método exibeDetalhes que exibe os detalhes do
//	carro. Faça leitura pelo teclado dos valores
	private String marca, modelo;
	private int ano;
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	
	public void setMarca(String marca) {
		if(!marca.isBlank()) {
			this.marca = marca;
		}
	}
	
	public void setModelo(String modelo) {
		if(!modelo.isBlank()) {
		this.modelo = modelo;
		}
	}
	
	public void setAno(int ano) {
		if(ano > 1886 && ano <= 2026) {
			this.ano = ano;
		}
	}
	
	public String exibeDetalhes() {
		return "Marca: " + getMarca() + " |Modelo: " + getModelo() + " |Ano: " +getAno();
	}
	
	
	public Carro(String marca, String modelo, int ano) {
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
	}
	
}
