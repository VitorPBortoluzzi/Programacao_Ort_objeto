package tarefa_08;

public class Filme {
//// TODO Crie uma classe chamada Filme com os atributos titulo, duracao (em minutos) e classificacaoEtaria. Crie um construtor que inicialize esses atributos. Implemente os métodos 
//	converterDuracaoHoras(), que retorna a duração do filme em horas, 
//	podeAssistir(int idade), que retorna true se a idade informada for maior ou igual à classificação etária, e
//	descricaoFilme(), que retorna uma string com as informações do filme.
	
	public String titulo;
	public int duracao;
	public int classificacaoEtaria;
	
	public Filme(String t, int d, int cE) {
		this.titulo = t;
		this.duracao = d;
		this.classificacaoEtaria = cE;
	}
	
	public double converterDuracaoHoras() {
		return duracao / 60.0;
	}
	
	public boolean podeAssistir(int idade) {
		if (idade >= classificacaoEtaria) {
			return true;
		} return false;
	}
	
	public String descricaoFilme() {
		return "Titulo: " + titulo + " Duração: " + duracao + " Classificação Etária: " + classificacaoEtaria;
	}
}
