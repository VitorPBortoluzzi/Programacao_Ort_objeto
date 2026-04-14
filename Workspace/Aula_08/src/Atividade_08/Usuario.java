package Atividade_08;

import java.util.Scanner;

public class Usuario{
    private String nomeUsuario;
    private String senha;
    private boolean logado;

    public Usuario(String nomeUsuario,String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.logado = false;
    }

    public void logIn(String usuario, String senha){
        if(!usuario.isBlank() && usuario.equals(this.nomeUsuario)){
            if(!senha.isBlank() && senha.equals(this.senha)){
                this.logado = true;
                System.out.println("Usuário logado com sucesso");
            } else System.err.println("Senha incorreta");
        } else System.err.println("Usuário não encontrado");
    }
    
    public void logOut() {
    	logado = false;
    }
    
    public void exibirStatus() {
    	String status;
    	if(logado == true) {
    		status = "Logado";
    	} else status = "Deslogado";
    	System.out.println("Estatus do usuário: "
    			+ "\n Usuário: " + nomeUsuario
    			+ " \n Status: " +  status);
    }

    public static void main(String[] args) {
		Usuario u1 = new Usuario("admin","admin");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira o nome de usuário: ");
		String nomeUsuario = teclado.nextLine().strip();
		System.out.println("Insira a senha: ");
		String senha = teclado.nextLine();
		
		u1.logIn(nomeUsuario, senha);
		u1.exibirStatus();
		
		u1.logOut();
		u1.exibirStatus();
	}
    
}