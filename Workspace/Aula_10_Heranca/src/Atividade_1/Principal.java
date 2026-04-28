package Atividade_1;

public class Principal {
	public static void main(String[] args) {
		Retangulo r = new Retangulo("Branco",false,5 , 5);
		System.out.println("Area: " + r.calcularArea(r.getAltura(), r.getLargura()));
		
	}
}
