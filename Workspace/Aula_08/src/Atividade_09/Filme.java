package Atividade_09;

import java.util.Scanner;

public class Filme{
    public String titulo;
    public String diretor;
    public int duracaoEmMinutos;
    public String genero;

    public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo
            + "\n Diretor: " + diretor +
            "\n Duração em minutos: " + duracaoEmMinutos +
            "\n Genero: " + genero 
        );
    }

    public boolean ehLongo(){
        return duracaoEmMinutos >= 120;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe os dados de um filme: ");
        System.out.print("Título: ");
        String titulo = teclado.nextLine();
        System.out.print("Diretor: ");
        String diretor = teclado.nextLine();
        System.out.print("Duração em minutos: ");
        int duracaoEmMinutos = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Genero: ");
        String genero = teclado.nextLine();

        Filme filme = new Filme(titulo,diretor,duracaoEmMinutos,genero);
        filme.exibirDetalhes();
        System.out.println("O filme é considerado longo? " + filme.ehLongo());
        
        teclado.close();
    }

}

