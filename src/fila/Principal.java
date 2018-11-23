package fila;

//Não está funcionando
public class Principal {
	
	public static void main(String [] args) {
		
		Fila f = new Fila();
		
		f.entrar(8);
		f.entrar(9);
		f.entrar(18);
		f.entrar(36);
		f.listar();
		f.sair(8);
		f.sair(9);
		f.listar();
		
	}

}
