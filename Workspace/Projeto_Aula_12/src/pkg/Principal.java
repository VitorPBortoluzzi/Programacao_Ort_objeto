package pkg;

public class Principal{	
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Vitor",23);
		exibeDados(p);
	}
	
	public static void exibeDados(Pessoa pe) {
		System.out.println("Nome: " + pe.getNome() );
		System.out.println("Idade: " + pe.getIdade());
	}
}
