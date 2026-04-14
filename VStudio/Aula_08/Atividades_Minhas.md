# Atividades:

## 1) Explique os seguintes conceitos de POO em Java:

    a) Classe: Modelo que define atributos e métodos de um tipo objeto;

    b) Objeto: Instância de uma classe. É um elemento real criado a partir da classe, contendo valores próprios para seus atributos.

    c) Atributo: Variáveis declaradas dentro da classe que armazenam o estado/dados do objeto.

    d) Método: "Estrutura de instruções"/"Comportamentos da classe/objeto"

    e) Encapsulamento: Limitações de acessos/controle de acessos dentro do projeto.
        -- Princípio que consiste em proteger os dados da classe, controlando o acesso por meio de métodos (getters/setters) e modificadores de acesso.

## 2) Qual a diferença entre método e construtor em uma classe? Dê um exemplo.
```java
   // Método: O método sera uma estrutura de instruções com nome diferente da classe;
   // Possui retorno ou void
   // Pode ser chamado várias vezes

    public class Pessoa {
    String nome;
    int idade;

    //Exmp: Método falar
    void falar() {
        System.out.println("Olá!");
    }

    // Construtor: Responsável por criar e iniciar o objeto da classe.
    // Tem o mesmo nome da Classe & não possui tipo retorno nem void;
    // Serve para inicializar atributos
    // Pode ser sobescrito

    public Pessoa(){}
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
```
## 3) O que são modificadores de acesso em Java? Cite e explique brevemente os principais.
    Modificadores de acesso em java remetem ao tipo de variável/Método e seu estado: 
    * Public - Qualquer classe dentro do pacote(package) tem acesso;
    * Private - O acesso é restrito a dentro da própria classe;
    * Protected - O acesso é restrito a classe e suas extensões;

## 4) Qual a diferença entre os tipos de dados String, int e boolean? Dê um exemplo de uso de cada um.
    Tipos de dados: 
    * String: Consiste de um buffer de carácteres;
    * Int: Valor inteiros e arredondados capacidade para armazenar valores q variam de 2.1**.***.*** até 2.1**.***.***;
    * Bollean: Consiste de um  valor lógico : tipo primitivo retorno de condição True/False


## 5) Explique o que é e para que serve o método toString() em uma classe.
    O método toString() serve para retornar uma representação textual do objeto;

## 6) Descreva o que acontece quando se tenta acessar um atributo privado diretamente fora da classe. Como é possível acessá-lo de forma correta?
    Quando se tenta acessar um atributo privado diretamente fora da claase, ele simplesmente n é encontrado / ele não existe para o compilador.
    Para acessalo é possivel fazendo uso de métodos public's getter's and setter's

## 7) Crie uma classe Produto com os atributos:

    nome (String)

    preco (double)

    quantidade (int)

    Implemente:

    Um método exibirInformacoes() que exibe os dados do produto

    Um método calcularValorTotal() que retorna o valor total em estoque (preço x quantidade)

    Na Main:

    Crie dois produtos, sendo um com valores informados via teclado e outro com valores definidos no código

    Exiba as informações e o valor total de cada produto

    ```java 

        import java.util.Scanner;

        public class Produto{
            public String nome;
            public double preco;
            public int quantidade;

            public Produto(String nome, Double preco, int quantidade){
                this.nome = nome;
                this.preco = preco;
                this.quantidade = quantidade;
            }

            public void exibirInformacoes(){  // O mesmo q um toString
                System.out.println("Nome: " + nome + " Preço: " + preco + " Quantidade: " + quantidade);
            }

            public double calcularValorTotal(){
                return preco * quantidade;
            }


            @Override
                public String toString(){
                    return "Nome: " + nome + " Preço: " + preco + " Quantidade: " + quantidade + "| Valor total: " + calcularValorTotal();
                }

            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);

                Produto p1 = new Produto("Teste1",100.99,25);
                System.out.println("Informe o nome do produto");
                String nome = teclado.nextLine();
                System.out.println("Informe o preço do produto");
                double preco = teclado.nextDouble();
                System.out.println("Informe a quantidade de produtos: ");
                int qtd = teclado.nextInt();

                Produto p2 = new Produto(nome,preco,qtd);

                p1.exibirInformacoes();
                System.out.println(p1.calcularValorTotal());
                System.out.println(p2.toString());

                teclado.close();
            }

        }

            
    ```

## 8) Crie uma classe Usuario com os atributos:

nomeUsuario (String)

senha (String)

logado (boolean, inicialmente false)

Implemente:

Um método login(String usuario, String senha) que valida os dados e muda o valor de logado para true se estiver correto

Um método logout() que define logado como false

Um método exibirStatus() que mostra se o usuário está logado ou não

Na Main:

Crie um usuário com nome e senha definidos no código

Peça que o usuário digite os dados via teclado para fazer login

Mostre se o login foi bem-sucedido e permita o logout


```java 
import java.util.Scanner;

public class Usuario{
    private String nomeUsuario;
    private String senha;
    private boolean logado;

    public Usuario(String nomeUsuario,String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.logado = false;
    }

    public void logIn(String usuario, String senha){
        if(!usuario.isBlank() && usuario.equals(this.nomeUsuario)){
            if(!senha.isBlank() && senha.equals(this.senha)){
                this.logado = true;
                System.out.println("Usuário logado com sucesso");
            } else System.err.println("Senha incorreta");
        } else System.err.println("Usuário não encontrado");
    }
    
    public void logOut() {
    	logado = false;
    }
    
    public void exibirStatus() {
    	String status;
    	if(logado == true) {
    		status = "Logado";
    	} else status = "Deslogado";
    	System.out.println("Estatus do usuário: "
    			+ "\n Usuário: " + nomeUsuario
    			+ " \n Status: " +  status);
    }

    public static void main(String[] args) {
		Usuario u1 = new Usuario("admin","admin");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira o nome de usuário: ");
		String nomeUsuario = teclado.nextLine().strip();
		System.out.println("Insira a senha: ");
		String senha = teclado.nextLine();
		
		u1.logIn(nomeUsuario, senha);
		u1.exibirStatus();
		
		u1.logOut();
		u1.exibirStatus();

        teclado.close();
	}
    
}
``` 

## 9) Crie uma classe Filme com os atributos:

titulo (String)

diretor (String)

duracaoEmMinutos (int)

genero (String)

Crie os métodos:

exibirDetalhes() para mostrar todas as informações do filme

ehLongo() que retorna true se o filme tiver mais de 120 minutos

Na Main:

Peça ao usuário os dados de um filme e mostre os detalhes e se ele é considerado um filme longo

```java 
import java.util.Scanner;

public class Filme{
    public String titulo;
    public String diretor;
    public int duracaoEmMinutos;
    public String genero;

    public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo
            + "\n Diretor: " + diretor +
            "\n Duração em minutos: " + duracaoEmMinutos +
            "\n Genero: " + genero 
        );
    }

    public boolean ehLongo(){
        return duracaoEmMinutos >= 120;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe os dados de um filme: ");
        System.out.print("Título: ");
        String titulo = teclado.nextLine();
        System.out.print("Diretor: ");
        String diretor = teclado.nextLine();
        System.out.print("Duração em minutos: ");
        int duracaoEmMinutos = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Genero: ");
        String genero = teclado.nextLine();

        Filme filme = new Filme(titulo,diretor,duracaoEmMinutos,genero);
        filme.exibirDetalhes();
        System.out.println("O filme é considerado longo? " + filme.ehLongo());
        
        teclado.close();
    }

}



```

## 10) Crie uma classe Tarefa com os atributos:

descricao (String)

concluida (boolean, inicializado como false)

Implemente:

Um método concluirTarefa() que marca a tarefa como concluída

Um método exibirTarefa() que exibe a descrição e se ela está concluída ou não

Na Main:

Crie um vetor ou lista com 3 tarefas (usando entrada via teclado)

Marque uma das tarefas como concluída

Mostre todas as tarefas com seu status

```java
import java.util.Scanner;

public class Tarefa{
    public String descricao;
    public boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluirTarafa(){
        this.concluida = true;
    }

    public void exibirTarefa(){
        System.out.println("Descrição: " + descricao);
        String status;
        if (concluida == true){
            status = "Concluida";
        } else status = "Não Concluida";
        System.out.println("Estatus: " + status);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Tarefa[] tarefa = new Tarefa[3];

        System.out.print("Insira a 1 tarefa: ");
        tarefa[0] = new Tarefa(teclado.nextLine());
        System.out.print("Insira a 2 tarefa: ");
        tarefa[1] = new Tarefa(teclado.nextLine());
        System.out.print("Insira a 3 tarefa: ");
        tarefa[2] = new Tarefa(teclado.nextLine());

        System.out.print("Insira qual tarefa deseja marcar como concluida(1,2,3): ");
        int temp = teclado.nextInt() - 1;
        tarefa[temp].concluirTarafa();
        
        for(int i = 0; i < 3; i++) {
        	System.out.println("Tarefa: " + (i+1));
        	tarefa[i].exibirTarefa();
        }

    }

}

```