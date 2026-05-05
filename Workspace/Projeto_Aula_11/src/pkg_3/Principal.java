package pkg_3;

public class Principal {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int resultado = c.somar(4, 3);
		System.out.println("Soma: " + resultado);
		resultado = c.somar(4, 7, 9);
		System.out.println("Soma2: " + resultado);
		double resultado2 = c.somar(3.5, 7);
		System.out.println("Soma 3: " + resultado2);
	}
}
