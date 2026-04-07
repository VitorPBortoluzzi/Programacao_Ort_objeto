package pkg;

public class Aluno {

	private String nome;
	private int nota1,nota2;
	
	public Aluno(String nome,int nota1,int nota2) {
		setNome(nome);
		setNota1(nota1);
		setNota2(nota2);
	}
	
	public void setNome(String nome) {
		if(!nome.isBlank() && nome != null) {
			this.nome = nome;
		} else {
			System.err.println("Nome inválido");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNota1() {
		return nota1;
	}
	
	public void setNota1(int nota1) {
		if(nota1 >= 0) {
			this.nota1 = nota1;
		} else {
			System.err.println("Nota inválida");
		}
	}
	
	
	public int getNota2() {
		return nota2;
	}
	
	public void setNota2(int nota2) {
		if(nota2 >= 0) {
			this.nota2 = nota2;
		} else {
			System.err.println("Nota inválida");
		}
	}
	
	public double calculaMedia() {
		return (nota1+nota2)/2;
	}
}

