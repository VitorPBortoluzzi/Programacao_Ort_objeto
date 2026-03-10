package pkg;

public class Aluno {
	public String nome;
	public String matricula;
	public String CPF;
	public int idade;
	
	@Override
    public String toString() {
        return "Nome: " + nome +
               "\nMatricula: " + matricula +
               "\nCPF: " + CPF + 
               "\nIdade: " + idade + "\n";
    }
}
