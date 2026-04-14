package Atividade_07;

// TODO - Represente a classe a baixo:

public class Carro {
    private String placa;
    private int numChassi;

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        if ( placa != null && !placa.isBlank()){
            this.placa = placa;
        }
    }

    public int getNumChassi(){
        return numChassi;
    }

    public void setNumChassi(int numChassi){
        if(numChassi > 0){
            this.numChassi = numChassi;
        }
    }

    public void acelerar(){
        System.out.println("Carro acelerando");
    }

    public boolean frear(){
        System.out.println("Carro freando");
        return true;

    }
}
