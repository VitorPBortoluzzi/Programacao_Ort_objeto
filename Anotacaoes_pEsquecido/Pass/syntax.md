### Classe p/Exemplo:
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

## Cria um Único Objeto da Classe;
```java
//Instanciando um Objeto;
"Classe 'nome' = new Classe();"
Carro c = new Carro();

c.marca = "VW";
c.modelo = "Gol";

System.out.println("Marca: " + c.marca);
System.out.println("Modelo: " + c.modelo);

//toString
System.out.println(c);
```

## Cria o vetor com n posições, cada inicia como null, preciso instanciar cada objeto;
```java
//Vetor de Objetos;
"Classe[] 'nome' = new Classe[tamanho];"
Carro[] carros = new Carro[5];
//!!!OBS!!!: Ainda precisa instanciar cada objeto do vetor
for(int i = 0; i < car.length; i++) {
    car[i] = new Carro();
}

//--------------------|Acessando|-----------------------
Carro[] carros = new Carro[2];

for(int i = 0; i < carros.length; i++) {
    carros[i] = new Carro();
}

carros[0].marca = "VW";
carros[0].modelo = "Gol";

carros[1].marca = "Ford";
carros[1].modelo = "Fiesta";

for(int i = 0; i < carros.length; i++) {
    System.out.println("Carro " + i);
    System.out.println("Marca: " + carros[i].marca);
    System.out.println("Modelo: " + carros[i].modelo);
}

//Com toString
for(int i = 0; i < carros.length; i++) {
	System.out.println(carros[i]);
}
```


## Sem tamanho Fixo, objetos são adicionados usando .add();
```java
//ArrayList de Objetos:
"ArrayList<Classe> 'nome' = new ArrayList<>();"

import java.util.ArrayList;

ArrayList<Carro> carros = new ArrayList<>();

carros.add(new Carro());
carros.add(new Carro());

//--------------------|Acessando|-----------------------
import java.util.ArrayList;

ArrayList<Carro> carros = new ArrayList<>();

Carro c1 = new Carro();
c1.marca = "VW";
c1.modelo = "Gol";

Carro c2 = new Carro();
c2.marca = "Ford";
c2.modelo = "Fiesta";

carros.add(c1);
carros.add(c2);

for(int i = 0; i < carros.size(); i++) {
    System.out.println("Carro " + i);
    System.out.println("Marca: " + carros.get(i).marca);
    System.out.println("Modelo: " + carros.get(i).modelo);
}

//Com toString
for(int i = 0; i < carros.size(); i++) {
	System.out.println(carros.get(i));
}
```


# Construtores

<h3>SEMPRE TERÁ O MESMO NOME DA CLASSE</h3>

Um **construtor** é um método especial usado para **inicializar um objeto no momento em que ele é criado**.

Ele é executado automaticamente quando usamos `new`.

Exemplo:

```java
Carro c = new Carro();
```

Quando essa linha é executada, o **construtor da classe `Carro` é chamado automaticamente**.

---

## Características do Construtor

* Possui **o mesmo nome da classe**
* **Não possui tipo de retorno** (nem `void`)
* É executado **automaticamente ao usar `new`**
* Pode **receber parâmetros**
* Pode existir **mais de um construtor na mesma classe**
* É usado principalmente para **inicializar atributos**

---

## Construtor Padrão (Default)

Se nenhum construtor for criado na classe, o Java cria automaticamente um **construtor vazio**.

Exemplo:

```java
public class Carro {

	public String marca;
	public String modelo;

}
```

O Java cria internamente:

```java
public Carro() {

}
```

---

## Construtor Criado Manualmente

Podemos criar um construtor para definir valores iniciais.

```java
public class Carro {

	public String marca;
	public String modelo;

	public Carro() {
		marca = "Desconhecida";
		modelo = "Desconhecido";
	}
}
```

Uso:

```java
Carro c = new Carro();

System.out.println(c);
```

Saída:

```
Marca: Desconhecida | Modelo: Desconhecido
```

---

## Construtor com Parâmetros

Permite **definir os valores do objeto já na criação**.

```java
public class Carro {

	public String marca;
	public String modelo;

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
}
```

Uso:

```java
Carro c = new Carro("VW", "Gol");

System.out.println(c);
```

Saída:

```
Marca: VW | Modelo: Gol
```

---

## Palavra-chave `this`

`this` representa **o próprio objeto atual**.

Ela é usada para diferenciar:

* **atributo da classe**
* **parâmetro recebido**

Exemplo:

```java
public Carro(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}
```

Significa:

```
atributo do objeto = valor recebido no construtor
```

---

## Sobrecarga de Construtores (Constructor Overload)

Uma classe pode possuir **vários construtores diferentes**.

Isso permite criar objetos de **formas diferentes**.

```java
public class Carro {

	public String marca;
	public String modelo;
	public int ano;

	public Carro() {

	}

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
}
```

Uso:

```java
Carro c1 = new Carro();
Carro c2 = new Carro("VW", "Gol");
Carro c3 = new Carro("Ford", "Fiesta", 2020);
```

---

## Construtor chamando outro construtor (`this()`)

Um construtor pode chamar **outro construtor da mesma classe**.

Isso evita repetição de código.

```java
public class Carro {

	public String marca;
	public String modelo;

	public Carro() {
		this("Desconhecida", "Desconhecido");
	}

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
}
```

Fluxo:

```
Carro() → chama Carro("Desconhecida","Desconhecido")
```

---

## Construtores em Vetores de Objetos

Quando usamos vetores de objetos, o construtor é chamado **cada vez que usamos `new`**.

```java
Carro[] carros = new Carro[3];

for(int i = 0; i < carros.length; i++) {
	carros[i] = new Carro("VW", "Gol");
}
```

Cada posição do vetor cria **um novo objeto**.

---

## Construtores em ArrayList

Com `ArrayList`, o construtor é chamado no momento do `add()`.

```java
ArrayList<Carro> carros = new ArrayList<>();

carros.add(new Carro("VW", "Gol"));
carros.add(new Carro("Ford", "Fiesta"));
```

Cada `new Carro()` executa o construtor.

---

## Diferença entre Construtor e Método

| Construtor              | Método                 |
| ----------------------- | ---------------------- |
| Mesmo nome da classe    | Nome livre             |
| Não possui retorno      | Possui retorno         |
| Executa ao criar objeto | Executa quando chamado |
| Inicializa o objeto     | Executa ações          |

---

## Fluxo de criação de um objeto

Quando executamos:

```java
Carro c = new Carro("VW", "Gol");
```

O Java realiza:

1. Reserva memória para o objeto
2. Executa o construtor
3. Inicializa os atributos
4. Retorna a referência do objeto

---

## Ideia principal

O construtor garante que **todo objeto seja criado já com seus dados inicializados**, deixando o objeto pronto para uso.

