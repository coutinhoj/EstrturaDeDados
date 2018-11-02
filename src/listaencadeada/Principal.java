package listaencadeada;

public class Principal {
	
	public static void main (String [] args) {
		
		Lista l = new Lista();
		
		l.inserir_inicio(1);
		l.inserir_inicio(2);
		l.inserir_inicio(3);
		l.inserir_final(4);
		l.inserir_final(5);
		l.localizar(0);
		l.remover_inicio();
		l.remover_fim();
		l.remover_posicao(2);
		
		String lista = l.listar();
		System.out.println(lista);
	}

}
