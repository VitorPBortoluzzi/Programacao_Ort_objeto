package tarefa_10;

public class Time {
//TODO Crie uma classe chamada Time com os atributos nome, golsMarcados e golsSofridos. Crie um construtor que inicialize os atributos. Implemente os métodos 
//	marcarGol(), que aumenta o número de gols marcados, 
//	sofrerGol(), que aumenta o número de gols sofridos, 
//	saldoGols(), que retorna a diferença entre gols marcados e sofridos, e 
//	resultadoPartida(), que retorna uma string indicando vitória, empate ou derrota com base no saldo de gols.
	
	public String nome;
	public int golsMarcados = 0;
	public int golsSofridos = 0;
	
	public Time(String n, int gM,int gS) {
		this.nome = n;
		this.golsMarcados = gM;
		this.golsSofridos = gS;
	}
	
	public void marcarGols() {
		golsMarcados++;
	}
	
	public void sofrerGols(int valor) {
		golsSofridos--;
	}
	
	public int saldoGols() {
		return golsMarcados - golsSofridos;
	}
	
	public String resultadoPartida() {
		String resultado = "";
		if(saldoGols() > 0) {
			resultado = ("Vitória: " + golsMarcados + " X " + golsSofridos);
		}
		if(saldoGols() == 0) {
			resultado = ( "Empate: " + golsMarcados + " X " + golsSofridos) ;
		}
		if(saldoGols() < 0) {
			resultado = ( "Derrota: " + golsMarcados + " X " + golsSofridos) ;
		}
		return resultado;
	}
	
}
