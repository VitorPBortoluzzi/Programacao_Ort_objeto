package tarefa_06;

public class Carro {
//TODO Crie uma classe chamada Carro com os atributos modelo, velocidadeAtual e velocidadeMaxima. Crie um construtor que inicialize esses atributos. Implemente os métodos 
//	acelerar(int valor), que aumenta a velocidade atual sem ultrapassar a velocidade máxima, 
//	frear(int valor), que diminui a velocidade atual sem permitir valores negativos, 
//	atingiuVelocidadeMaxima(), que retorna true se a velocidade atual for igual à velocidade máxima, e 
//	calcularTempoViagem(double distancia), que retorna o tempo aproximado de viagem considerando a fórmula tempo = distância dividido pela velocidade atual.
	
	public String modelo;
	public int velocidadeAtual;
	public int velocidadeMaxima;
	
	public Carro(String modelo, int vA, int vM){
		this.modelo = modelo;
		this.velocidadeAtual = vA;
		this.velocidadeMaxima = vM;
	}
	
	public void acelerar(int valor) {
		System.out.println("Acelerando");
		int temp = velocidadeAtual + valor;
		if (temp > velocidadeMaxima) {
			temp = velocidadeMaxima;
		}
		
		for (int i = velocidadeAtual; i < temp; i++) {
			System.out.println("Velocidade: " + i);
		}
		
		velocidadeAtual = temp;
	}
	
	public void frear(int valor) {
		System.out.println("Freando");
		int temp = velocidadeAtual - valor;
		if (temp < 0) {
			temp = 0;
		}
		
		for (int i = velocidadeAtual; i > temp; i--) {
			System.out.println("Velocidade: " + i);
		}
		
		velocidadeAtual = temp;
	}
	
	public boolean atingiuVelocidadeMaxima() {
		if (velocidadeAtual == velocidadeMaxima) {
			return true;
		} return false;
	}
//	calcularTempoViagem(double distancia), que retorna o tempo aproximado de viagem considerando a fórmula tempo = distância dividido pela velocidade atual.
	public double calcularTempoViagem(double distancia) {
		double tempo = distancia / velocidadeAtual;
		return tempo;
	}
}
