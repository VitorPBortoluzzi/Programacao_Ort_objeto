package pkg;

public class Principal2 {
	public static void main(String[] args) {
		Produto p1 = new Produto("Caneta" , 1.5);
		Produto p2 = p1.clone(); //Cria uma cópia de P1
		//Produto p2 = p1.aponta(); // Apontando para P1
		
		System.out.println("P1| Nome: " + p1.getNome() + "Preco: " + p1.getPreco());
		System.out.println("P2| Nome: " + p2.getNome() + "Preco: " + p2.getPreco());
		
		p2.setPreco(2.73);
		
		System.out.println("P1| Nome: " + p1.getNome() + "Preco: " + p1.getPreco());
		System.out.println("P2| Nome: " + p2.getNome() + "Preco: " + p2.getPreco());
		
		
	}
}
