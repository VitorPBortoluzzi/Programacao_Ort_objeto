package pkg;

public class Onibus extends Carro{
	protected String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void exibirMensagem() {
		System.out.println("Estou na classe onibus");
		System.out.println("O Carro é: " + nome);
		System.out.println("Modelo é: " + modelo);
	}
}
