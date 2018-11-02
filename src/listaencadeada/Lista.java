package listaencadeada;

//Aula do dia 21 de Outubro 2018

public class Lista{
	
	private No cabeca_lista;
	
	public Lista () {
		cabeca_lista = null;
	}
	
	//metodo inserir inicio
	public void inserir_inicio (int conteudo) {
		
		No novo_no = new No (conteudo);
		
		if(cabeca_lista == null) {
			cabeca_lista = novo_no;
		}else
			
			novo_no.prox = cabeca_lista;
		    cabeca_lista = novo_no;
		
	}
	
	//metodo inserir final
    public void inserir_final(int conteudo) {
		
		No novo_no = new No(conteudo);
		
		if(cabeca_lista == null) {
			cabeca_lista =novo_no;
		}else
		{
		   No aux;
		   aux = cabeca_lista;
		  while(aux.prox != null) {
			  aux = aux.prox;
		  }
		  
		  aux.prox = novo_no;
		  
	   }
	}		
	
    //metodo localizar
    public boolean localizar (int n) {
    	No aux = cabeca_lista;
    	
    	boolean encontrou = false;
    	System.out.println("Não encontrou!");
    	
    	while ((aux!= null)&&(!encontrou)) {
    		
    		if (aux.info == n) {
    			encontrou = true;
    			System.out.println("Encontrou!");
    		}
    		 
    		aux = aux.prox;
    		
    	}
    	
    	return encontrou;
    	
    }
    
    //metodo remover inicio
    public void remover_inicio() {
    	if(cabeca_lista != null) {
    		cabeca_lista = cabeca_lista.prox;
    	}
    }
	
    public void remover_fim () {
    	No aux1 = cabeca_lista;
    	No aux2 = cabeca_lista;
    	
    	if(aux1.prox == null) {
    		
    	}else if (aux1.prox == null) {
    		cabeca_lista = null;
    	}else {
    		while(aux1.prox != null) {
    			aux1 = aux1.prox;
    		}
    		
    		while(aux2.prox != null) {
    			aux2 = aux2.prox;
    		}
    		aux2.prox = null;
    	}
    }
    
    //metodo remover posicao 
    public String remover_posicao (int posicao) {
    	
    	No aux = cabeca_lista;
    	String msg ="";
    	int qtd_elementos = getQtdElementos();
    	
    	if (cabeca_lista == null) {
    		 
    		msg = "Lista Vazia";
    	}else
    		
    		if (qtd_elementos < posicao) {
    			
    			msg = "Menos elementos do que a posição requerida";
    		}else 
    			
    			if (posicao == 1) {
    				
    				remover_inicio();
    				msg = "Removendo inicio";
    			}else
    				
    				if (posicao == qtd_elementos) {
    					remover_fim();
    					msg = "Removendo final";
    				}else {
    					
    					for (int i = 1; i<posicao; i++) {
    						aux = aux.prox;
    						
    					}
    					
    					No aux2 = aux.prox;
    					aux.prox = aux2.prox;
    					msg ="Removido meio";
    				}
		return msg;
    	
    }
    
    public int getQtdElementos () {
    	int qtd = 0;
    	No aux = cabeca_lista;
    	
    	while(aux != null) {
    		qtd = qtd + 1;
    		aux = aux.prox;
    	}
    	
    	return qtd;
    }  
    
   //metodo listar
	public String listar() {
		
		//declarando variavel
		No aux; // variavael aux é do tipo No
		
		aux = cabeca_lista;  
		
		//declarando a variavel lista do tipo String - lista é vazia
		String lista_string =null;
		
		//Enquanto aux é diferente de null
		while(aux!=null){
			
			//lista_string recebe lista_string + aux apontando para info (conteudo da lista)
			lista_string = lista_string +"."+aux.info;
			
			//aux = aux apontando para prox (próximo elemento)
			aux = aux.prox;
		}
		
		// se lista_string for igual a null
		if(lista_string == null){
			
			//lista_string recebe Lista vazia
			lista_string ="Lista vazia";
		}
		// se nao retorna lista_string
		return lista_string;	
	}

}
