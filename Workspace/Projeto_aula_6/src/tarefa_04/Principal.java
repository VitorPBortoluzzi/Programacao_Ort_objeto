package tarefa_04;

public class Principal {

	public static void main(String[] args) {
		// Teste 1
        Retangulo r1 = new Retangulo(5.0, 3.0);

        System.out.println("Retângulo 1:");
        System.out.println("Largura: 5.0 | Altura: 3.0");
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        System.out.println("Diagonal: " + r1.calcularDiagonal());
        System.out.println("É quadrado? " + r1.ehQuadrado());

        System.out.println("----------------------");

        // Teste 2 (quadrado)
        Retangulo r2 = new Retangulo(4.0, 4.0);

        System.out.println("Retângulo 2:");
        System.out.println("Largura: 4.0 | Altura: 4.0");
        System.out.println("Área: " + r2.calcularArea());
        System.out.println("Perímetro: " + r2.calcularPerimetro());
        System.out.println("Diagonal: " + r2.calcularDiagonal());
        System.out.println("É quadrado? " + r2.ehQuadrado());

	}

}
