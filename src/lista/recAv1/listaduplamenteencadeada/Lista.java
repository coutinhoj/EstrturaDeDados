package lista.recAv1.listaduplamenteencadeada;

public class Lista {
	
private Nod cabeca_lista;
	
	public Lista () {
		 
		cabeca_lista = null;
	}
	
	//metodo inserir ok
	public void inserir (int conteudo) {
		Nod novo_no = new Nod(conteudo);

		if (null == cabeca_lista) {
			cabeca_lista = novo_no;
		}else {
			Nod aux = cabeca_lista;
			while(aux.prox != null) {
				aux = aux.prox;
			}
			
			aux.prox = novo_no;
		}
	}
	

	public int excluirInicio() {
		
		int n =-1;
		
		if(cabeca_lista == null) {
			System.out.println("Erro! Lista vazia");
		}else {
			n=cabeca_lista.info;
			cabeca_lista = cabeca_lista.prox;
			cabeca_lista.ant = null;
		}
		
		
		return n;
		
	}
	

	//metodo listar ok
	public void listar () {
		
		Nod aux;
		aux = cabeca_lista;
		
		while (aux != null) {
			
			System.out.println(aux.info + "");
			aux=aux.prox;
		}
		
     if(cabeca_lista == null){
	
    	    System.out.println("Lista Vazia");
		}

            System.out.println("\n");
			
	}
	


}
