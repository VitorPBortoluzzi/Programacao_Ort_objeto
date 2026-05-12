package Atv_03;

public class Gerente extends Funcionario {
	private double bonus = 0.2;
	
	public double calcularSalario() {
		return salario * bonus;
	}
	
}
