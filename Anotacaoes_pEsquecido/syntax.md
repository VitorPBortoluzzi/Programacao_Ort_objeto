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