package pkg_3;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Joao",25);
		p.exibirDados();	
		
		PessoaJuridica Empresa = new PessoaJuridica("Cervale", 25, "123456789-12", p, "28/04/2001");
		
		System.out.println("Sócio: " +Empresa.getSocio().getNome());
		
		System.out.println(Empresa.toString());
	}
}
