package tar_06;

public class Aluno {
	public String nome;
	public String matricula;
	public float nota1,nota2,nota3;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome +
				"\nMatricula " + matricula +
				"\tNotas: [" + nota1 + "|" + nota2 + "|" + nota3 + "]\n";
				
	}
}
