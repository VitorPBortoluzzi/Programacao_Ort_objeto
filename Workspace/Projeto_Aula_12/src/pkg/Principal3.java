package pkg;

public class Principal3{
	public static void main(String[] args) {
//		Endereco endereco = new Endereco("Rua Andradas",1614);
//		Pessoa2 p2 = new Pessoa2("UFN",75,endereco);
		Pessoa2 p2 = new Pessoa2("UFN",75,new Endereco("Rua Andradas",1614));
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Idade: " + p2.getIdade());
		//System.out.println("Endereco: " + p2.getEndereco());
		System.out.println("Endereco: " + p2.getEndereco().toString());
		System.out.println("Endereco: \n \t Rua: " + p2.getEndereco().getRua() + "\n \t Número: " + p2.getEndereco().getNumero() );
		System.out.print("Texto original\b\b\b");
	}
}
