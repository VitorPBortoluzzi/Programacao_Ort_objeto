package Atv_Relacionamento_01;

public class Aluno {
	private String nome;
	private double notaFinal;
	
	Aluno(String nome, double notaFinal){
		this.nome = nome;
		this.notaFinal = notaFinal;
	}
	
	public String getNome() {
		return nome;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
}
