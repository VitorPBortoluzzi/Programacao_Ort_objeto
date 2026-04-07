# Objeto em Java

Um **objeto** é uma **instância de uma classe**, ou seja, é a representação concreta de algo definido em uma classe, contendo **dados (atributos)** e **comportamentos (métodos)**.

---
### Exemplo

```java
public class Pessoa {
    String nome;
    int idade;

	//Método
    void falar() {
        System.out.println("Olá!");
    }
}
```

---

### Criando um objeto (instanciação)

```java
"Classe 'nome' = new Classe();"
Pessoa p = new Pessoa();
p.nome = "Vitor";
p.idade = 23;
p.falar();
```

# 👷‍♂️ Construtor em java

O construtor serve para criar e inicializar objetos, podendo aplicar regras (como validação) logo na criação, garantindo consistência dos dados desde o início.

---

### Características

* Possui o **mesmo nome da classe**
* **Não possui tipo de retorno**
* É chamado automaticamente ao usar `new`
* Pode ser **sobrecarregado** (vários construtores)

---

```java
public class Pessoa{
	public String nome;
	public int idade;

	//Construtor limpo
	public Pessoa(){}

	//Construtor com parametros
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
}
```
---
### Main
```java
public class Principal {
	public static void main(String[] args) {
		//Instanciando os objetos
		Pessoa p1 = new Pessoa(); // sem valores iniciais
		Pessoa p2 = new Pessoa("Vitor", 23); // com valores definidos
	}
}
```



# 🔒 Encapsulamento em Java

Encapsulamento é o princípio de **proteger os dados internos de uma classe**, permitindo acesso controlado por meio de métodos. Em vez de acessar atributos diretamente, utiliza-se **getters e setters**, o que possibilita validação, manutenção e segurança.

### Objetivos principais

* **Proteção dos dados:** impede alterações indevidas.
* **Controle de acesso:** define regras para leitura e modificação.
* **Validação:** garante que os dados sempre estejam em um estado válido.
* **Manutenção facilitada:** mudanças internas não afetam quem usa a classe.

---

### Exemplo aprimorado

```java
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
```
---
### Main

```java
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ricardo",-40);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		
		System.out.print("Digite o novo nome: ");
		p.setNome(teclado.nextLine());
		System.out.print("Digite a nova idade: ");
		p.setIdade(teclado.nextInt());
		System.out.println(p.getNome() + "|" + p.getIdade());
	}
	
}
```
---
### Saída:
```shell
Idade inválida
Nome: Ricardo
Idade: 0
Digite o novo nome: Vitor
Digite a nova idade: 23
Vitor|23
```
---

### Melhorias aplicadas

* **Uso de `IllegalArgumentException`:** mais adequado que `System.err.println`, pois força o tratamento do erro. Interrompe o código;
* **Validação simplificada:** `isBlank()` já cobre `isEmpty()`.
* **Reutilização de lógica:** construtor usa setters para evitar duplicação.
* **Encapsulamento real:** atributos continuam `private`, acessíveis apenas via métodos.

---

### Boas práticas

* Sempre manter atributos como `private`.
* Validar dados nos setters.
* Evitar lógica complexa fora da classe (centralizar nela).
* Usar exceções para erros críticos, não apenas prints.

---

