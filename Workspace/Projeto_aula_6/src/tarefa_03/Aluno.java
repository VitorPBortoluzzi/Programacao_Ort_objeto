package tarefa_03;

public class Aluno {
// TODO Crie uma classe chamada Aluno com os atributos nome, nota1, nota2 e nota3. Crie um construtor que inicialize esses atributos. Implemente os métodos 
//	calcularMedia(), que retorna a média das três notas, 
//	aprovado(), que retorna true se a média for maior ou igual a 7, 
//	maiorNota(), que retorna a maior nota entre as três, e 
//	menorNota(), que retorna a menor nota entre elas.
	
	public String nome;
	public double nota1,nota2,nota3;
	
	public Aluno(String nome, double n1,double n2,double n3) {
		this.nome = nome;
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
	}
	
	public double calcularMedia() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public boolean aprovado() {
		if (calcularMedia() >= 7) {
			return true;
		} else return false;
	}
	
	public double maiorNota() {
		double maior = nota1;
		if (nota2 > maior ) {
			maior = nota2;
		}
		if (nota3 > maior) {
			maior = nota3;
		}
		return maior;
	}
	
	public double menorNota() {
		double menor = nota1;
		if (nota2 < menor ) {
			menor = nota2;
		}
		if (nota3 < menor) {
			menor = nota3;
		}
		return menor;
	}
}
