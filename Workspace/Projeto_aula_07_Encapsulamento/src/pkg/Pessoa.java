package pkg;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor usando setters para reaproveitar validações
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    // Getter: retorna o valor do atributo
    public String getNome() {
        return nome;
    }

    // Setter: valida antes de atribuir
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
			System.err.println("Nome inválido");
            // throw new IllegalArgumentException("Nome inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
			System.err.println("Idade inválida");
            //throw new IllegalArgumentException("Idade não pode ser negativa");
        }
    }
}