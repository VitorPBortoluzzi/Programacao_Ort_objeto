## 🧠 Programação Orientada a Objetos em Java (Resumo Completo)

---

# 📌 Objeto em Java

Um **objeto** é uma **instância de uma classe**, ou seja, a representação concreta de algo, contendo:

* **Atributos** → dados
* **Métodos** → comportamentos

---

### 🔹 Exemplo de classe

```java
public class Pessoa {
    String nome;
    int idade;

    void falar() {
        System.out.println("Olá!");
    }
}
```

---

### 🔹 Criando um objeto (instanciação)

```java
Pessoa p = new Pessoa();
p.nome = "Vitor";
p.idade = 23;
p.falar();
```

✔ `new` → cria o objeto
✔ Cada objeto possui seu próprio estado

---

# 👷‍♂️ Construtor em Java

O **construtor** é responsável por **criar e inicializar o objeto**, garantindo que ele já comece com valores definidos e válidos.

---

### 🔹 Características

* Mesmo nome da classe
* Não possui tipo de retorno
* Executado automaticamente com `new`
* Pode ser **sobrecarregado**

---

### 🔹 Exemplo

```java
public class Pessoa {
    public String nome;
    public int idade;

    // Construtor padrão
    public Pessoa() {}

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

---

### 🔹 Uso

```java
Pessoa p1 = new Pessoa();
Pessoa p2 = new Pessoa("Vitor", 23);
```

---

### 🔹 Boa prática (evitar duplicação)

```java
public Pessoa(String nome, int idade) {
    setNome(nome);
    setIdade(idade);
}
```

✔ Reaproveita validações
✔ Mantém consistência dos dados

---

# 🔒 Encapsulamento em Java

Encapsulamento é o princípio de **proteger os dados** e permitir acesso controlado.

---

### 🎯 Objetivos

* Proteger dados
* Controlar acesso
* Validar informações
* Facilitar manutenção

---

### 🔹 Exemplo completo

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            System.err.println("Nome inválido");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.err.println("Idade inválida");
        }
    }
}
```

---

### 🔹 Uso com entrada de dados

```java
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ricardo", -40);
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

### 🔹 Saída

```shell
Idade inválida
Nome: Ricardo
Idade: 0
Digite o novo nome: Vitor
Digite a nova idade: 23
Vitor|23
```

---

# 📦 Trabalhando com múltiplos objetos

## 🔹 Vetor (array fixo)

```java
Pessoa[] pessoas = new Pessoa[2];

for (int i = 0; i < pessoas.length; i++) {
    pessoas[i] = new Pessoa("Padrão", 0);
}
```

✔ Precisa instanciar cada posição
✔ Tamanho fixo

---

## 🔹 ArrayList (dinâmico)

```java
import java.util.ArrayList;

ArrayList<Pessoa> lista = new ArrayList<>();

lista.add(new Pessoa("Vitor", 23));
System.out.println(lista.get(0).getNome());
```

✔ Tamanho dinâmico
✔ Mais usado em sistemas reais

---

# 🚀 Exemplo prático (CRUD simples)

```java
import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {

        ArrayList<Pessoa> lista = new ArrayList<>();

        // CREATE
        lista.add(new Pessoa("Vitor", 23));
        lista.add(new Pessoa("Ana", 30));

        // READ
        for (Pessoa p : lista) {
            System.out.println(p.getNome());
        }

        // UPDATE
        Pessoa p = lista.get(0);
        p.setNome("Carlos");

        // DELETE
        lista.remove(1);

        System.out.println("\nApós alterações:");
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.getNome());
        }
    }
}
```

---

# 🧠 Resumo Final

* **Objeto** → instância da classe
* **Construtor** → inicializa o objeto
* **Encapsulamento** → protege e valida dados
* **Array/Vetor** → múltiplos objetos (fixo)
* **ArrayList** → múltiplos objetos (dinâmico)
* **CRUD** → base de sistemas reais

---

✔ **Teoria + prática integradas**
✔ **Do básico ao aplicado**
✔ **Padrão usado no mercado**
