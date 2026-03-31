package tarefa_02;

public class ContaBancaria {
// TOOD2 - Crie uma classe chamada ContaBancaria com os atributos titular e saldo. Crie um construtor que inicialize esses atributos. 
//	Implemente os métodos depositar(double valor), que adiciona um valor ao saldo, 
//	sacar(double valor), que realiza o saque apenas se houver saldo suficiente e retorna true ou false, 
//	transferir(double valor, ContaBancaria destino), que transfere um valor para outra conta caso haja saldo suficiente, 
//	e consultarSaldo(), que retorna o saldo atual da conta.
	
	public String titular;
	public double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			return true;
		}
		return false;
	}
	
	public void transferir(double valor, ContaBancaria destino) {
		if (saldo >= valor) {
			saldo -= valor;
			destino.saldo += valor;
			System.out.println("Transação efetuada");
		} else {
			System.out.println("Saldo Insuficiente");
		}

	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Titular :" + titular + " Saldo: " + saldo; 
		}
	
}
