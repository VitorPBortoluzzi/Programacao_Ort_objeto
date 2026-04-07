## 📌 Classe (com explicação)

```java
public class Carro {

	public String marca;
	public String modelo;

	@Override
	public String toString() {
		return "Marca: " + marca + " | Modelo: " + modelo;
	}
}
```

### 🔎 Explicação

* Classe → modelo do objeto
* Atributos → dados
* `toString()` → define como o objeto será exibido

---

## 📌 Criando um único objeto

```java
Carro c = new Carro();

c.marca = "VW";
c.modelo = "Gol";

System.out.println(c);
```

### 🔎 Explicação

* `new` cria o objeto
* Acesso direto aos atributos
* `println(obj)` usa `toString()`

---

## 📌 Vetor de objetos (fixo)

```java
Carro[] carros = new Carro[2];

for(int i = 0; i < carros.length; i++) {
	carros[i] = new Carro();
}

carros[0].marca = "VW";
carros[1].marca = "Ford";

for(int i = 0; i < carros.length; i++) {
	System.out.println(carros[i]);
}
```

### 🔎 Explicação

* Vetor inicia com `null`
* Precisa instanciar cada posição
* Acesso: `carros[i]`

---

## 📌 ArrayList (dinâmico)

```java
import java.util.ArrayList;

ArrayList<Carro> carros = new ArrayList<>();

carros.add(new Carro());
carros.get(0).marca = "VW";

System.out.println(carros.get(0));
```

### 🔎 Explicação

* Tamanho dinâmico
* `.add()` adiciona
* `.get()` acessa

---

# 📌 Construtores

## 🔹 Exemplo

```java
public Carro(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}
```

### 🔎 Explicação

* Inicializa o objeto na criação
* `this` → objeto atual

---

# 📌 Encapsulamento

## 🔹 Classe protegida

```java
public class Carro {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
```

### 🔎 Explicação

* `private` protege
* `get/set` controlam acesso

---

# 🚀 EXEMPLOS COMPLEXOS

---

## 📌 Classe completa (encapsulada + validação)

```java
public class Carro {

	private String marca;
	private String modelo;
	private int ano;

	public Carro(String marca, String modelo, int ano) {
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
	}

	public String getMarca() { return marca; }
	public String getModelo() { return modelo; }
	public int getAno() { return ano; }

	public void setMarca(String marca) {
		if(marca != null && !marca.isEmpty()) {
			this.marca = marca;
		}
	}

	public void setModelo(String modelo) {
		if(modelo != null && !modelo.isEmpty()) {
			this.modelo = modelo;
		}
	}

	public void setAno(int ano) {
		if(ano >= 1886 && ano <= 2026) {
			this.ano = ano;
		}
	}

	@Override
	public String toString() {
		return marca + " - " + modelo + " (" + ano + ")";
	}
}
```

### 🔎 Explicação

* Encapsulamento completo
* Validação nos setters
* Construtor usa setters → garante dados válidos

---

## 📌 Sistema com ArrayList (CRUD básico)

```java
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {

		ArrayList<Carro> lista = new ArrayList<>();

		//CREATE
		lista.add(new Carro("VW", "Gol", 2015));
		lista.add(new Carro("Ford", "Fiesta", 2020));

		//READ
		for(Carro c : lista) {
			System.out.println(c);
		}

		//UPDATE
		Carro c = lista.get(0);
		c.setModelo("Polo");

		//DELETE
		lista.remove(1);

		System.out.println("\nApós alterações:");
		for(Carro car : lista) {
			System.out.println(car);
		}
	}
}
```

### 🔎 Explicação

* Simula um sistema real
* CRUD:

  * Create → add
  * Read → listar
  * Update → set
  * Delete → remove

---

## 📌 Busca com regra (lógica)

```java
for(Carro c : lista) {
	if(c.getMarca().equalsIgnoreCase("VW")) {
		System.out.println(c);
	}
}
```

### 🔎 Explicação

* Uso de lógica com objetos
* `equalsIgnoreCase` → evita erro de maiúsculas

---

## 📌 Misturando Vetor + Encapsulamento

```java
Carro[] carros = new Carro[2];

for(int i = 0; i < carros.length; i++) {
	carros[i] = new Carro("Padrão", "Padrão", 0);
}

carros[0].setMarca("Toyota");
// Percorre automáticamente, utilizar apeanas para exibição,!!! SEM ÍNDICE!!!
for(Carro c : carros) {
	System.out.println(c);
}
```

### 🔎 Explicação

* Vetor + construtor + encapsulamento juntos
* Cada posição é um objeto independente

---

# 🧠 Resumo Final

* Básico → criar e acessar objetos
* Intermediário → vetores e ArrayList
* Avançado → encapsulamento + validação + lógica
* Complexo → sistema com CRUD, busca e organização

👉 Isso já representa um padrão usado em sistemas reais.
