package pkg;

public class Principal {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.nome = "Fusca";
		c.exibirMensagem();
		
		Onibus o = new Onibus();
		o.nome = "Marcopolo";
		o.setModelo("XNB-0145");
		o.exibirMensagem();
	}
}
