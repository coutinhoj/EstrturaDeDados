package listascirculares;


public class Principal {

	public static void main(String[] args) {
		
			
			ListaCircular l = new ListaCircular();
			
			l.inserir_inicio(50);
			l.inserir_fim(30);
			l.inserir_inicio(10);
			l.inserir_fim(60);
			l.localizar(10);
			
			//l.remover_fim();
			
			String Lista_Circular = l.listar();
		}

	

}
