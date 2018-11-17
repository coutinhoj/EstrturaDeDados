package listaduplamenteencadeada;

public class Lista_Dupla_Encadeada {
	
	private Nod cabeca_lista;
	
	public Lista_Dupla_Encadeada () {
		 
		cabeca_lista = null;
	}
	
   // metodo inserir no inicio
	public void insere_inicio(int n) {
		
		Nod novo_no = new Nod(n);
		
		if (cabeca_lista == null) {
			
			novo_no.prox = cabeca_lista;
			cabeca_lista = novo_no;
		}else {
			novo_no.prox = cabeca_lista;
			cabeca_lista.ant = novo_no;
			cabeca_lista = novo_no;
					
		}
	}
	
	//metodo inserir no fim
	public void insere_fim(int n) {
		
		Nod aux;
		Nod novo_no = new Nod(n);
		
		if(cabeca_lista == null) {
			
			cabeca_lista = novo_no;
		}else {
			aux = cabeca_lista;
			
			while( aux.prox != null) {
				
				aux = aux.prox;
			}
			
			aux.prox = novo_no;
			novo_no.ant = aux;
		}
	}
	
	//metodo listar
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
	
	//metodo inserir ordenado
	public void insere_ordenado (int n) {
		
		Nod aux = cabeca_lista;
		
		Nod novo_no = new Nod(n);
		
		if(aux == null) {      //lista vazia
			
			cabeca_lista = novo_no;
		}else 
			
			while (aux.info < n && aux.prox != null) {
				aux = aux.prox;
			}
			
			if (aux.info < n) {  //Está no último elemento
				aux.prox = novo_no;
				novo_no.ant = aux;
			}
			
			if(aux.info > n) {
				
				if (aux.ant == null) { //deverá ser o primeiro elemento
					aux.ant = novo_no;
					novo_no.prox = aux;
					cabeca_lista = novo_no;
				}else {
					novo_no.prox = aux; // inserir no meio
					novo_no.ant = aux.ant;
					aux.ant.prox = novo_no;
					aux.ant = novo_no;
							
					 }
			}
	}
	
	
	public Nod localizar(int conteudo) {
		Nod aux = cabeca_lista;
		while (aux != null && aux.info != conteudo) {
			aux = aux.prox;
		}
		return aux;
	}
	
	
	public void remover (int n) {
		
		Nod aux = cabeca_lista;
		
		if(aux == null) { //lista vazia
			
		}else {
			
			if(cabeca_lista.info == n) {
				
				cabeca_lista = cabeca_lista.prox; // é o primeiro elemento
			}else
				
				while(aux != null && aux.info !=n) {
					aux = aux.prox;
				}
			
			if(aux !=null) {
				if(aux.prox == null) { // é o último elemento
					aux.ant.prox = null;
					aux.ant =null;
				}else {
					aux.prox.ant = aux.ant; //está no meio
					aux.ant.prox =aux.prox;
				}
			}
		}
	}

}
