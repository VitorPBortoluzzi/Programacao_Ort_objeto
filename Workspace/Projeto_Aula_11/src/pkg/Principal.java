package pkg;

public class Principal {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println("Animal: ");
		a.fazerSom();
		Cachorro c = new Cachorro();
		System.out.println("Cachorro: ");
		c.fazerSom();
		
		Passarinho p = new Passarinho();
		System.out.println("Passarinho: ");
		p.fazerSom();
		
		Peixe pe = new Peixe();
		System.out.println("Peixe: ");
		pe.fazerSom();
	}
}
