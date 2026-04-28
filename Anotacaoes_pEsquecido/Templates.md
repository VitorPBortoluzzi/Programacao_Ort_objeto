## 🔗 Índice
- [📁 Estrutura do Pacote](#-estrutura-do-pacote)
- [🧠 InputUtils (Entrada segura)](#-inpututils-entrada-segura)
- [📂 FileUtils (Arquivos completos)](#-fileutils-arquivos-completos)
- [📦 DataParser (Conversão genérica)](#-dataparser-conversão-genérica)
- [🧩 Menu Genérico (Modular)](#-menu-genérico-modular)
- [🧩 Menu Flexível (Map + Lambda)](#-menu-flexível-map--lambda)
- [🛠️ Exemplo de Uso Integrado](#️-exemplo-de-uso-integrado)

---

## 📁 Estrutura do Pacote

```

templates/
├── Main.java
├── utils/
│    ├── InputUtils.java
│    ├── FileUtils.java
│    └── DataParser.java
└── core/
└── Menu.java

````

---

## 🧠 InputUtils (Entrada segura)

```java
package templates.utils;

import java.util.Scanner;

public class InputUtils {

    public static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double lerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Digite um decimal válido: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static String lerString(Scanner sc) {
        sc.nextLine(); // limpa buffer
        return sc.nextLine();
    }
}
````

---

## 📂 FileUtils (Arquivos completos)

```java
package templates.utils;

import java.io.*;
import java.util.*;

public class FileUtils {

    // 🔹 Escrever (sobrescreve)
    public static void writeAll(String path, List<String> linhas) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (String l : linhas) {
            bw.write(l);
            bw.newLine();
        }
        bw.close();
    }

    // 🔹 Adicionar no final
    public static void append(String path, String linha) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        bw.write(linha);
        bw.newLine();
        bw.close();
    }

    // 🔹 Ler tudo
    public static List<String> readAll(String path) throws IOException {
        List<String> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String l;
        while ((l = br.readLine()) != null) {
            lista.add(l);
        }
        br.close();
        return lista;
    }

    // 🔹 Ler linha a linha (callback)
    public static void readLineByLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String l;
        int i = 0;
        while ((l = br.readLine()) != null) {
            System.out.println(i + ": " + l);
            i++;
        }
        br.close();
    }

    // 🔹 Ler a partir da linha X
    public static List<String> readFrom(String path, int inicio) throws IOException {
        List<String> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String l;
        int i = 0;

        while ((l = br.readLine()) != null) {
            if (i >= inicio) lista.add(l);
            i++;
        }

        br.close();
        return lista;
    }

    // 🔹 Ler da linha X até Y
    public static List<String> readRange(String path, int inicio, int fim) throws IOException {
        List<String> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String l;
        int i = 0;

        while ((l = br.readLine()) != null) {
            if (i >= inicio && i <= fim) {
                lista.add(l);
            }
            i++;
        }

        br.close();
        return lista;
    }

    // 🔹 Remover linha por índice
    public static void removeLine(String path, int index) throws IOException {
        List<String> linhas = readAll(path);
        if (index >= 0 && index < linhas.size()) {
            linhas.remove(index);
            writeAll(path, linhas);
        }
    }

    // 🔹 Atualizar linha por índice
    public static void updateLine(String path, int index, String nova) throws IOException {
        List<String> linhas = readAll(path);
        if (index >= 0 && index < linhas.size()) {
            linhas.set(index, nova);
            writeAll(path, linhas);
        }
    }
}
```

---

## 📦 DataParser (Conversão genérica)

```java
package templates.utils;

public class DataParser {

    public static String join(String sep, Object... valores) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < valores.length; i++) {
            sb.append(valores[i]);
            if (i < valores.length - 1) sb.append(sep);
        }
        return sb.toString();
    }

    public static String[] split(String linha, String sep) {
        return linha.split(sep);
    }
}
```

---

## 🧩 Menu Genérico (Modular)

```java
package templates.core;

import java.util.Scanner;

public class Menu {

    public static void executar(Scanner sc) {
        int op;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ação 1");
            System.out.println("2 - Ação 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    acao1(sc);
                    break;
                case 2:
                    acao2(sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }

    private static void acao1(Scanner sc) {
        System.out.println("Executar lógica aqui...");
    }

    private static void acao2(Scanner sc) {
        System.out.println("Executar lógica aqui...");
    }
}
```

---

## 🧩 Menu Flexível (Map + Lambda)

```java
package templates.core;

import java.util.*;
import java.util.function.Consumer;

public class MenuFlex {

    public static void executar(Scanner sc) {

        Map<Integer, Consumer<Scanner>> acoes = new HashMap<>();

        acoes.put(1, s -> System.out.println("Ação 1"));
        acoes.put(2, s -> System.out.println("Ação 2"));

        int op;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ação 1");
            System.out.println("2 - Ação 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();

            if (op == 0) {
                System.out.println("Encerrando...");
            } else if (acoes.containsKey(op)) {
                acoes.get(op).accept(sc);
            } else {
                System.out.println("Inválido!");
            }

        } while (op != 0);
    }
}
```

---

## 🛠️ Exemplo de Uso Integrado

```java
package templates;

import java.util.*;
import templates.core.Menu;
import templates.utils.FileUtils;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Menu.executar(sc);

        // Exemplo de arquivo
        FileUtils.append("dados.txt", "linha exemplo");

        List<String> linhas = FileUtils.readRange("dados.txt", 0, 2);
        for (String l : linhas) {
            System.out.println(l);
        }

        sc.close();
    }
}
```
---