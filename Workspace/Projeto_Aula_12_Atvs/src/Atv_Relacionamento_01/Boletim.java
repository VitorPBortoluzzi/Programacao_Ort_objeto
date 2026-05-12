package Atv_Relacionamento_01;

public class Boletim {

	public void imprimirStatus(Aluno a) {
		if (a.getNotaFinal() >= 6) {
			System.out.println("Aluno: " + a.getNome() + "| Aprovado");
		} System.out.println("Aluno: " + a.getNome() + "| Reprovado: " + a.getNotaFinal());
	}
	
	public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Vitor", 7.5);
        Aluno aluno2 = new Aluno("Carlos", 5.0);

        Boletim boletim = new Boletim();

        boletim.imprimirStatus(aluno1);
        boletim.imprimirStatus(aluno2);
    }
}
