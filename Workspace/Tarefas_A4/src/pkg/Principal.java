package pkg;

public class Principal {
//	Crie uma classe ContaCorrente que obedeça à descrição abaixo (continuação): V
//	Crie um objeto novaConta do tipo ContaCorrente. V
//	Chame o método definirSaldoInicial passando o valor 1000 como parâmetro. V
//	Escreva o valor do atributo saldo V
//	Realize um saque de 500 reais (utilize o método sacar). V
//	Faça um depósito de 50 reais (utilize o método depositar) V
//	Escreva o valor do atributo saldo na tela.
//	Realize um saque de 600 reais.
//	Escreva o valor do atributo saldo na tela
	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente();
		novaConta.definirSaldo_inicial(1000);
		System.out.println(novaConta.saldo);
		
		//novaConta.sacar(500);
		if(novaConta.sacar(500)) {
			System.out.println("Na Main: Saque Efetuado");
		}
		novaConta.depositar(50);
		System.out.println(novaConta.saldo);
		if(novaConta.sacar(600)) {
			System.out.println("Na Main: Saque Efetuado");
		}
		//novaConta.sacar(600);
		System.out.println(novaConta.saldo);
	}

}
