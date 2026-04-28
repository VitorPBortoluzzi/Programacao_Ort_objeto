# 🧠 POO em Java (Resumo Compacto)

## 🔗 Índice
- [📌 Objeto](#-objeto)
- [👷‍♂️ Construtor](#️-construtor)
- [🔒 Encapsulamento](#-encapsulamento)
- [📦 Coleções](#-coleções)
- [🚀 CRUD](#-crud)
- [🧬 Herança](#-herança)
- [🔑 Acesso](#-modificadores-de-acesso)
- [👷‍♂️ super](#️-uso-do-super)
- [🔁 Override](#-override)
- [🧾 toString](#-tostring)

---

## 📌 Objeto
Instância de classe → **dados (atributos)** + **ações (métodos)**

```java
Pessoa p = new Pessoa();
p.nome = "Vitor";
p.falar();
````

✔ `new` cria o objeto
✔ Cada objeto tem seu próprio estado

---

## 👷‍♂️ Construtor

Inicializa o objeto automaticamente ao usar `new`.

✔ Mesmo nome da classe
✔ Sem retorno
✔ Pode ter parâmetros (sobrecarga)

```java
public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

✔ Boa prática: usar setters dentro do construtor

---

## 🔒 Encapsulamento

Protege os dados com acesso controlado.

✔ `private` + `get/set`
✔ Permite validação

```java
public void setIdade(int idade) {
    if (idade >= 0) this.idade = idade;
}
```

---

## 📦 Coleções

### 🔹 Array

```java
Pessoa[] pessoas = new Pessoa[2];
```

✔ Tamanho fixo

### 🔹 ArrayList

```java
ArrayList<Pessoa> lista = new ArrayList<>();
```

✔ Dinâmico (mais usado)

---

## 🚀 CRUD

Operações básicas:

```java
lista.add(new Pessoa("Vitor", 23)); // CREATE
lista.get(0);                       // READ
p.setNome("Carlos");                // UPDATE
lista.remove(1);                    // DELETE
```

---

## 🧬 Herança

Reutiliza código entre classes.

```java
class Cachorro extends Animal {}
```

✔ `extends` = herda atributos/métodos

---

## 🔑 Modificadores de acesso

| Modificador | Classe | Pacote | Subclasse |
| ----------- | ------ | ------ | --------- |
| private     | ✔      | ❌      | ❌         |
| default     | ✔      | ✔      | ❌         |
| protected   | ✔      | ✔      | ✔         |
| public      | ✔      | ✔      | ✔         |

---

## 👷‍♂️ Uso do `super`

### 🔹 Construtor

```java
super(nome, idade, "Au au");
```

✔ Chama construtor da classe pai
✔ Deve ser a primeira instrução

### 🔹 Método

```java
super.emitirSom();
```

---

## 🔁 Override

Sobrescreve comportamento da classe pai.

```java
@Override
public void emitirSom() {
    System.out.println("Au au");
}
```

---

## 🧾 toString()

Converte objeto em texto.

### ❌ Padrão

```
Pessoa@1a2b3c
```

### ✅ Sobrescrito

```java
@Override
public String toString() {
    return nome + " - " + idade;
}
```

✔ Melhora debug
✔ Evita mostrar endereço de memória

---

## 🧠 Essência

* Objeto = instância
* Construtor = inicialização
* Encapsulamento = proteção
* Herança = reutilização
* Override = personalização
* toString = representação
