package tarefa_05;

public class Principal {

	public static void main(String[] args) {
        // Criando um funcionário
        Funcionario f1 = new Funcionario("Carlos", 3000.0, 10);

        System.out.println("Funcionário: " + f1.nome);
        System.out.println("Salário base: R$ " + f1.salario);
        System.out.println("Horas extras: " + f1.horasExtras);
        System.out.println("Valor das horas extras: R$ " + f1.calcularValorHoraExtra());
        System.out.println("Pagamento total: R$ " + f1.calcularPagamentoTotal());
        System.out.println("Salário anual: R$ " + f1.salarioAnual());

        System.out.println("------------------------");

        // Adicionando horas extras
        f1.adicionarHorasExtras(5);
        System.out.println("Horas extras após adicionar 5 horas: " + f1.horasExtras);
        System.out.println("Novo valor das horas extras: R$ " + f1.calcularValorHoraExtra());
        System.out.println("Novo pagamento total: R$ " + f1.calcularPagamentoTotal());

        System.out.println("------------------------");

        // Outro funcionário
        Funcionario f2 = new Funcionario("Ana", 4500.0, 0);
        System.out.println("Funcionário: " + f2.nome);
        System.out.println("Salário anual: R$ " + f2.salarioAnual());
	}

}
