package pkg_2_jgrapido;

public class Cachorro extends Animal{
	private String raca;
	
	public Cachorro() {
		this.som = "Au AU aU";
	}
	
	public Cachorro(String nome,int idade,String raca) {
		super(nome,idade,"Au Au Au");
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaça(String raca) {
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println(getSom());
	}
}
