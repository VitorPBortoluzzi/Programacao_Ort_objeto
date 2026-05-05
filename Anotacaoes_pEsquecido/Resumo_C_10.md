## 🧠 Programação Orientada a Objetos em Java (Resumo Completo)

## 🔗 Índice
- [📌 Objeto em Java](#objeto-em-java)
- [👷‍♂️ Construtor em Java](#️construtor-em-java)
- [🔒 Encapsulamento em Java](#encapsulamento-em-java)
- [📦 Trabalhando com múltiplos objetos](#trabalhando-com-múltiplos-objetos)
- [🚀 Exemplo prático (CRUD simples)](#exemplo-prático-crud-simples)
- [🧬 Herança em Java](#herança-em-java)
- [🔑 Modificadores de acesso](#modificadores-de-acesso)
- [📦 Herança entre pacotes](#herança-entre-pacotes)
- [👷‍♂️ Uso do super](#️uso-do-super)
- [🔁 Override (Sobrescrita)](#override-sobrescrita)
- [🧾 Método toString()](#método-tostring-em-objetos-detalhe-importante)

# Objeto em Java

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
````

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

# Construtor em Java

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

# Encapsulamento em Java

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

# Trabalhando com múltiplos objetos

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

# Exemplo prático (CRUD simples)

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

# Herança e uso de `super` em Java
# Herança em Java

Herança permite que uma classe **herde atributos e métodos** de outra.

* Classe pai → superclasse
* Classe filha → subclasse

---

### 🔹 Exemplo

```java
public class Animal {
    protected String nome;

    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Cachorro extends Animal {
}
```

✔ `extends` cria a herança

---

# Modificadores de acesso

| Modificador | Mesma classe | Mesmo pacote | Subclasse outro pacote |
| ----------- | ------------ | ------------ | ---------------------- |
| private     | ✔            | ❌            | ❌                      |
| default     | ✔            | ✔            | ❌                      |
| protected   | ✔            | ✔            | ✔                      |
| public      | ✔            | ✔            | ✔                      |

---

# Herança entre pacotes

```java
package pacote1;

public class Animal {
    protected String nome;
}
```

```java
package pacote2;

import pacote1.Animal;

public class Cachorro extends Animal {
    public void teste() {
        nome = "Rex"; // ✔ permitido
    }
}
```

---

# Uso do `super`

## 🔹 Construtor da superclasse

```java
public class Animal {
    protected String nome;
    protected int idade;
    protected String som;

    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }
}
```

```java
public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Au au");
        //O msm que:
            //Animal a = new Animal(nome,idade,"Au au")
    }
}
```

✔ Inicializa atributos herdados
✔ Evita duplicação

---

## 🔹 Acessar método da superclasse

```java
@Override
public void emitirSom() {
    super.emitirSom();
    System.out.println("Au au");
}
```

---

# Override (Sobrescrita)

```java
@Override
public void emitirSom() {
    System.out.println("Au au");
}
```

✔ Mesmo nome
✔ Mesmo comportamento base, porém modificado


# Método `toString()` em Objetos (Detalhe Importante)

O método `toString()` é usado para **representar um objeto como texto**.

---

## 🔹 Comportamento padrão do Java

Se você NÃO sobrescrever o `toString()`, o Java retorna:

```text
nomeDoPacote.NomeClasse@hashCode
```

### 🔹 Exemplo

```java
Pessoa p = new Pessoa("Carlos", 40);
System.out.println(p);
```

✔ Saída padrão:

```text
pkg.Pessoa@1a2b3c
```

---

## ❗ Problema comum

Ao usar um objeto dentro de outro:

```java
", socio=" + socio
```

✔ Resultado indesejado:

```text
socio=pkg.Pessoa@1a2b3c
```

---

## ✅ Solução 1 (RECOMENDADA): sobrescrever `toString()` na classe

```java
@Override
public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
}
```

✔ Agora:

```java
System.out.println(socio);
```

✔ Saída:

```text
Pessoa [nome=Carlos, idade=40]
```

---

## ✅ Solução 2: acessar atributos manualmente

```java
", socio=" + socio.getNome()
```

✔ Saída:

```text
socio=Carlos
```

---

## 🔹 Exemplo completo em `PessoaJuridica`

```java
@Override
public String toString() {
    return "PessoaJuridica [CNPJ=" + CNPJ 
        + ", socio=" + socio 
        + ", dtAbertura=" + dtAbertura 
        + ", nome=" + nome
        + ", idade=" + idade + "]";
}
```

✔ Com `toString()` sobrescrito em `Pessoa`, a saída fica legível

---

## 🔑 Boas práticas

* Sempre sobrescreva `toString()` em classes de modelo
* Facilita debug e exibição de dados
* Evita saída com referência de memória
* Torna o sistema mais legível

---

## 🧠 Resumo

* `toString()` → converte objeto em texto
* Sem sobrescrita → mostra endereço de memória
* Com sobrescrita → mostra dados úteis
* Essencial ao trabalhar com objetos dentro de objetos
