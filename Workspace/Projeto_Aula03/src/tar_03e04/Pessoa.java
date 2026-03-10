package tar_03e04;

public class Pessoa {
	public String nome;
	public String genero;
	public int idade;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome +
				"\nGenero: " + genero +
				"\nIdade: " + idade + "\n";
	}
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		System.out.println(p1);
	}
}
