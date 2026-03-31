package tarefa_04;

public class Retangulo {
// TODO Crie uma classe chamada Retangulo com os atributos largura e altura. Crie um construtor que inicialize esses atributos. Implemente os métodos 
//	calcularArea(), que retorna a área do retângulo, 
//	calcularPerimetro(), que retorna o perímetro,
//	calcularDiagonal(), que calcula e retorna a diagonal utilizando a função Math.sqrt(), e 
//	ehQuadrado(), que retorna true caso a largura seja igual à altura.
	
	public double largura;
	public double altura;
	
	public Retangulo(double l, double a) {
		this.largura = l;
		this.altura = a;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return 2*(largura * altura);
	}
	
	public double calcularDiagonal() {
		double diagonal = Math.sqrt((altura * altura) + (largura * largura));
		return diagonal;
	}
	
	public boolean ehQuadrado() {
		if (largura == altura) {
			return true;
		}else return false;
	}
}
