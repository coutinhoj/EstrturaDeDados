package lista2.fila;

import fila.Fila;

public class Principal {
	
public static void main(String [] args) {
		
		Fila f = new Fila();
		
		f.entrar(1);
		f.entrar(2);
		f.entrar(3);
		f.entrar(4);
		f.entrar(5);
		f.listar();
		f.sair(1);
		f.sair(2);
		f.listar();
		
	}

}
