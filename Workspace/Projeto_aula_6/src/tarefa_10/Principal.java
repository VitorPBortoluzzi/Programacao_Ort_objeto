package tarefa_10;

public class Principal {
	public static void main(String[] args) {
		// Criando times
        Time time1 = new Time("Grêmio", 0, 0);
        Time time2 = new Time("Inter", 0, 0);

        // Simulando uma partida
        time1.marcarGols(); // Grêmio 1
        time1.marcarGols(); // Grêmio 2

        time2.marcarGols(); // Inter 1

        // Exibindo resultados
        System.out.println("=== RESULTADO DA PARTIDA ===");
        System.out.println("Time: " + time1.nome);
        System.out.println("Gols marcados: " + time1.golsMarcados);
        System.out.println("Gols sofridos: " + time1.golsSofridos);
        System.out.println("Saldo de gols: " + time1.saldoGols());
        System.out.println("Resultado: " + time1.resultadoPartida());

        System.out.println();

        System.out.println("Time: " + time2.nome);
        System.out.println("Gols marcados: " + time2.golsMarcados);
        System.out.println("Gols sofridos: " + time2.golsSofridos);
        System.out.println("Saldo de gols: " + time2.saldoGols());
        System.out.println("Resultado: " + time2.resultadoPartida());

        // Testando empate
        Time time3 = new Time("Brasil", 1, 1);
        System.out.println("\n=== TESTE EMPATE ===");
        System.out.println("Resultado: " + time3.resultadoPartida());

        // Testando derrota
        Time time4 = new Time("Argentina", 0, 2);
        System.out.println("\n=== TESTE DERROTA ===");
        System.out.println("Resultado: " + time4.resultadoPartida());
	}
}
