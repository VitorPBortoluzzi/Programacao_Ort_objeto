package tarefa_02;

public class Principal {

	public static void main(String[] args) {
		// TOOD2 - Crie uma classe chamada ContaBancaria com os atributos titular e saldo. Crie um construtor que inicialize esses atributos. 
//		Implemente os métodos depositar(double valor), que adiciona um valor ao saldo, 
//		sacar(double valor), que realiza o saque apenas se houver saldo suficiente e retorna true ou false, 
//		transferir(double valor, ContaBancaria destino), que transfere um valor para outra conta caso haja saldo suficiente, 
//		e consultarSaldo(), que retorna o saldo atual da conta.

		ContaBancaria cB1 = new ContaBancaria("SujeitoA",1000.5);
		System.out.println(cB1);
		cB1.depositar(101);
		System.out.println(cB1.consultarSaldo());
		System.out.println(cB1.sacar(100));
		System.out.println(cB1.sacar(10000));
		
		ContaBancaria cB2 = new ContaBancaria("SujeitoB",0.5);
		System.out.println(cB2);
		cB1.transferir(399.5, cB2);
		System.out.println(cB2.consultarSaldo());
		
	}

}
