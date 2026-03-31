package tarefa_05;

public class Funcionario {
//// TODO Crie uma classe chamada Funcionario com os atributos nome, salario e horasExtras. Crie um construtor que inicialize esses atributos. Implemente os métodos 
//	calcularValorHoraExtra(), considerando que cada hora extra vale 50 reais, 
//	calcularPagamentoTotal(), que retorna o salário mais o valor das horas extras, 
//	adicionarHorasExtras(int horas), que soma horas extras ao total atual, e 
//	salarioAnual(), que retorna o salário anual considerando apenas o salário base.
	
	public String nome;
	public double salario;
	public int horasExtras;
	
	public Funcionario(String n, double s, int h) {
		this.nome = n;
		this.salario = s;
		this.horasExtras = h;
	}
	
	public double calcularValorHoraExtra() {
		return horasExtras * 50.0;
	}
	
	public double calcularPagamentoTotal() {
		return salario += calcularValorHoraExtra();
	}
	
	public void adicionarHorasExtras(int horas) {
		horasExtras += horas;
	}
	
	public double salarioAnual() {
		return  salario * 12;
	}
}
