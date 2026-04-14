package Atividade_05;

import java.util.Scanner;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    
    public Triangulo(double ladoA, double ladoB, double ladoC){
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        if(ladoA <= 0){
            System.err.println("Valor inválido");
        } else this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        if(ladoB <= 0){
            System.err.println("Valor inválido");
        }else this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        if(ladoC <= 0){
            System.err.println("Valor inválido");
        }else this.ladoC = ladoC;
    }

    public boolean verificaEquilatero() {
        return ladoA == ladoB && ladoB == ladoC;
    }

    // medida de qualquer um de seus lados deve ser menor que a soma das medidas dos outros dois lados (e maior que o valor absoluto da diferença entre eles)

    public boolean existeTriangulo() {
        return (ladoA + ladoB > ladoC) &&
            (ladoA + ladoC > ladoB) &&
            (ladoB + ladoC > ladoA);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        System.out.print("Digite o lado A: ");
        double ladoA = (teclado.nextDouble());

        System.out.print("Digite o lado B: ");
        double ladoB = (teclado.nextDouble());

        System.out.print("Digite o lado C: ");
        double ladoC = teclado.nextDouble();
        Triangulo triangulo = new Triangulo(ladoA,ladoB,ladoC);
        
        if(triangulo.existeTriangulo()){
            System.out.println("Triangulo equilatero: " + triangulo.verificaEquilatero()); 
        } else {
            System.err.println("Valores não formam um triangulo");
            System.err.println("A Medida de qualquer um de seus lados deve ser menor que a soma das medidas dos outros dois l5ados (e maior que o valor absoluto da diferença entre eles)");
        }

        teclado.close();
    }
}

