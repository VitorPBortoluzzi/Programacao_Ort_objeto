package Atividade_10;

import java.util.Scanner;

public class Tarefa{
    public String descricao;
    public boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluirTarafa(){
        this.concluida = true;
    }

    public void exibirTarefa(){
        System.out.println("Descrição: " + descricao);
        String status;
        if (concluida == true){
            status = "Concluida";
        } else status = "Não Concluida";
        System.out.println("Estatus: " + status);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Tarefa[] tarefa = new Tarefa[3];

        System.out.print("Insira a 1 tarefa: ");
        tarefa[0] = new Tarefa(teclado.nextLine());
        System.out.print("Insira a 2 tarefa: ");
        tarefa[1] = new Tarefa(teclado.nextLine());
        System.out.print("Insira a 3 tarefa: ");
        tarefa[2] = new Tarefa(teclado.nextLine());

        System.out.print("Insira qual tarefa deseja marcar como concluida(1,2,3): ");
        int temp = teclado.nextInt() - 1;
        tarefa[temp].concluirTarafa();
        
        for(int i = 0; i < 3; i++) {
        	System.out.println("Tarefa: " + (i+1));
        	tarefa[i].exibirTarefa();
        }

    }

}