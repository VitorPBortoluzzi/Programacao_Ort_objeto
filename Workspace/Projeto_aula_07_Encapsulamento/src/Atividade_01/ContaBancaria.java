package Atividade_01;

public class ContaBancaria {
	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		setLimite(limite);
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor) {
		if(valor > 0 ) {
			saldo += valor;
		}else {
			System.err.println("Valor inválido");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && (saldo + limite) >= valor) {
			saldo -= valor;
		} else {
			System.err.println("Saldo insuficiente");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	
}
