package tarefa_01;

public class Disciplina {
//todo) Crie uma classe Disciplina que contenha os atributos (nome, carga horária e nome do professor) e os métodos de atribuir e recuperar esses valores. Mostre na tela:
//	a) O conteúdo original dos atributos
//	b) A opção para o usuário inserir os valores
//	c) A exibição do novo conteúdo dos atributos
	public String nome;
	public int Carg_horar;
	public String nome_prof;
	
	public void atribuirValores(String n,int Carg, String np) {
		this.nome = n;
		this.Carg_horar = Carg;
		this.nome_prof = np;
	}
	
	public String retornaNome() {
		return nome;
	}
	
	public String retornaNome_professor() {
		return nome_prof;
	}
	
	public int retornCarga_hor() {
		return Carg_horar;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Nome: " + nome +
					"\nCarga Horária: " + Carg_horar +
					"h\n\t Nome Professor: " + nome_prof;
					
		}
}
