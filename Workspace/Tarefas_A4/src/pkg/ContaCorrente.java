package pkg;

public class ContaCorrente {
//	A classe possui o atributo saldo do tipo float e os métodos definirSaldoInicial, depositar e sacar.





	public float saldo;
	public void definirSaldo_inicial(float valor) {
//		O método definirSaldoInicial deve atribuir o valor passado por parâmetro ao atribuito saldo
		saldo = valor;
	}
	public boolean sacar(float valor) {
//		O método sacar deve reduzir o valor passado por parâmetro do saldo já existente
//		Necessário verificar a condição de o valor do saldo ser insuficiente para o saque que se deseja fazer.
//		O valor de retorno deve ser true (verdadeiro) quando for possível realizar o saque e false (falso) quando não for possível (public bool sacar(float valor))
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Operação Concluida");
			return true;
		}
		System.out.println("Operação Negada -- Saldo insuficiente");
		return false;
		
	}
	
	public void depositar(float valor) {
//		O método depositar, deve adicionar o valor passado por parâmetro ao atributo saldo
		saldo += valor;
	}
}
