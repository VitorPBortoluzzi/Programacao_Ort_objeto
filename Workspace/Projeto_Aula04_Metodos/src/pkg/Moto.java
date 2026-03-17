package pkg;

public class Moto {
	public String marca;
	public String modelo;
	public int cilindradas;
	
	public void atribuirValores(String mar, String mod, int cil) {
		this.marca = mar;
		this.modelo = mod;
		this.cilindradas = cil;
	}
	
	public String retornarMarca() {
		return marca;
	}
	
	public String retornarMod() {
		return modelo;
	}
	
	public int retornarCil() {
		return cilindradas;
	}
	
	@Override
	public String toString() {

		return "Marca: " + marca +
				" & Modelo: " + modelo +
				" & Cilindradas: " + cilindradas;
	}
}
