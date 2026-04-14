package Atividade_06;

import java.util.Scanner;

public class Pessoa {
// //TODO - 6 - Crie uma classe Pessoa que possua os atributos nome, idade e cpf.
// Proteja os atributos utilizando encapsulamento. Crie os métodos get e set
// para cada atributo. Crie um método verificaMaiorDeIdade que verifica se a
// pessoa é maior de idade e retorna o resultado. Faça leitura pelo teclado dos
// valores.

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf){
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (!nome.isBlank()){
            this.nome = nome;
        } else System.err.println("Valor inválido");
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if(idade <= 0 ){
          System.err.println("Valor Inválido");  
        } else this.idade = idade;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        if (!cpf.isBlank()){
            this.cpf = cpf;
        } else System.err.println("Valor inválido");
    }

    public boolean verificaMaiorDeIdade(){
        return idade >= 18;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o seu CPF: ");
        String cpf = teclado.nextLine();

        Pessoa p = new Pessoa(nome,idade,cpf);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("CPF: " + p.getCpf());
        System.out.println("Maior de idade: " + p.verificaMaiorDeIdade());

        teclado.close();
    }
    
}
