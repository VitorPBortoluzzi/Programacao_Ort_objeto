package Atividade_07;

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

    }

}
