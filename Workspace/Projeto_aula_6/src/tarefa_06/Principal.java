package tarefa_06;

public class Principal {
	public static void main(String[] args) {

        // Criando um carro
        Carro c1 = new Carro("Fusca", 0, 120);

        // Testando aceleração
        System.out.println("Acelerando 50 km/h...");
        c1.acelerar(50);
        System.out.println("Velocidade atual: " + c1.velocidadeAtual);
        System.out.println("Atingiu velocidade máxima? " + c1.atingiuVelocidadeMaxima());

        System.out.println("------------------------");

        // Acelerando além da velocidade máxima
        System.out.println("Acelerando 100 km/h...");
        c1.acelerar(100);
        System.out.println("Velocidade atual: " + c1.velocidadeAtual);
        System.out.println("Atingiu velocidade máxima? " + c1.atingiuVelocidadeMaxima());

        System.out.println("------------------------");

        // Testando frenagem
        System.out.println("Freando 30 km/h...");
        c1.frear(30);
        System.out.println("Velocidade atual: " + c1.velocidadeAtual);

        System.out.println("------------------------");

        // Testando cálculo de tempo de viagem
        double distancia = 240; // km
        System.out.println("Tempo estimado para percorrer " + distancia + " km: " + c1.calcularTempoViagem(distancia) + " horas");

        System.out.println("------------------------");

        // Testando frenagem total
        System.out.println("Freando 200 km/h...");
        c1.frear(200);
        System.out.println("Velocidade atual: " + c1.velocidadeAtual);
    }
}
