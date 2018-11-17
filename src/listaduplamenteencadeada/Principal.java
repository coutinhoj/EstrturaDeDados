package listaduplamenteencadeada;

public class Principal {
	
   public static void main(String[] args) {
	   
	   Lista_Dupla_Encadeada l = new Lista_Dupla_Encadeada();
	   
	   l.insere_inicio(7);
	   l.insere_inicio(2);
	   l.insere_fim(19);
	   l.insere_fim(9);
	   l.insere_ordenado(4);
	   l.localizar(2); //rever localizar
	   //l.remover(2);
	   l.listar();
	   
	  
	   
		
	}

}
