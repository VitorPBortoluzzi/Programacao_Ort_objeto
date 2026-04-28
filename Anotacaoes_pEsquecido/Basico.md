# 🧩 Templates de Sintaxe Básica em Java

## 🔗 Índice
- [📦 ArrayList](#-arraylist)
- [📋 List (Interface)](#-list-interface)
- [🔁 for](#-for)
- [🔁 for-each](#-for-each)
- [🔁 while](#-while)
- [🔁 do-while](#-do-while)
- [🔀 switch-case](#-switch-case)
- [❓ if / else](#-if--else)

---

## 📦 ArrayList

```java
import java.util.ArrayList;

ArrayList<String> lista = new ArrayList<>();

// adicionar
lista.add("Item 1");

// acessar
String valor = lista.get(0);

// alterar
lista.set(0, "Novo Item");

// remover
lista.remove(0);

// tamanho
int tamanho = lista.size();
```

---

## 📋 List (Interface)

```java
import java.util.List;
import java.util.ArrayList;

List<String> lista = new ArrayList<>();

lista.add("A");
lista.add("B");
```

✔ Mais flexível (boa prática usar List ao invés de ArrayList direto)

---
## 📦 List<List<...>> (por índice)

✔ Grupos numerados  
✔ Acesso por posição  

```java
List<List<Pessoa>> grupos = new ArrayList<>();

grupos.add(new ArrayList<>()); // grupo 0
grupos.get(0).add(new Pessoa("João", 25));

Pessoa p = grupos.get(0).get(0);
````

---

## 🗂️ Map<String, List<...>> (por nome)

✔ Grupos nomeados  
✔ Mais legível e usado

```java
Map<String, List<Pessoa>> grupos = new HashMap<>();

grupos.put("RH", new ArrayList<>());
grupos.get("RH").add(new Pessoa("João", 25));

Pessoa p = grupos.get("RH").get(0);
```

---

## ⚖️ Regra rápida

* Índice → `List<List>`
* Nome → `Map<String, List>` ✔ (melhor geral)

---

## 🔥 Template recomendado

```java
Map<String, List<Pessoa>> grupos = new HashMap<>();

// criar grupo
grupos.put("NomeGrupo", new ArrayList<>());

// adicionar
grupos.get("NomeGrupo").add(obj);

// percorrer
for (String chave : grupos.keySet()) {
    for (Pessoa p : grupos.get(chave)) {
        System.out.println(p);
    }
}
```


## 🔁 for

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

## 🔁 for-each

```java
for (String item : lista) {
    System.out.println(item);
}
```

✔ Ideal para percorrer listas

---

## 🔁 while

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

## 🔁 do-while

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

✔ Executa pelo menos 1 vez

---

## 🔀 switch-case

```java
int op = 1;

switch (op) {
    case 1:
        System.out.println("Opção 1");
        break;

    case 2:
        System.out.println("Opção 2");
        break;

    case 0:
        System.out.println("Sair");
        break;

    default:
        System.out.println("Inválido");
}
```

---

## ❓ if / else

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

## 🧠 Dicas Rápidas

* Use `List` ao invés de `ArrayList` sempre que possível
* `for-each` é melhor para leitura
* `do-while` é ideal para menus
* `switch` é melhor que muitos `if` para opções fixas
* Sempre use `{}` mesmo em blocos simples