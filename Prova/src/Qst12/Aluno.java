package Qst12;


public class Aluno {
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		setNome(nome);
		setNota(nota);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public boolean aprovado() {
		if (getNota() >= 7) {
			System.out.println("Aprovado");
			return true;
		} else {
			System.out.println("Reprovado");
			return false;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Nota: "+ getNota());
		System.out.print("Aprovação: ");
		aprovado();
	}
	

}
