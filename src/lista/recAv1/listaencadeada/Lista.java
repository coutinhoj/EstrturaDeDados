package lista.recAv1.listaencadeada;

import listaencadeada.No;

public class Lista {
	
private No cabeca_lista;
	
	public Lista () {
		cabeca_lista = null;
	}
	
	
	//metodo inserir ok
	public void inserir (int conteudo) {
		No novo_no = new No(conteudo); 
		
		if(cabeca_lista == null) {
			cabeca_lista = novo_no;
			
			}else {
				
				No aux = cabeca_lista;
				while(aux.prox !=null) {
					aux = aux.prox;
				}
				
				aux.prox = novo_no;
			}
	}
	
	//metodo listar ok
	public void listar() {
		if(cabeca_lista == null) {
			System.out.println("Lista Vazia");
		}else {
			No aux = cabeca_lista;
			while(aux!=null) {
				System.out.println(aux.info +"");
				aux = aux.prox;
			}
		}
	}
	
	//metodo excluir inicio ok
	public void excluir_inicio() {
		cabeca_lista = cabeca_lista.prox;
	}
	
	//metodo Excluir elemento N qualquer, onde N é o conteúdo de um nó da lista (falta)
	public void excluir_elemento_n(int conteudo) {
		No novo_no = new No(conteudo);
		
		if(cabeca_lista == null) {
			System.out.println("Lista Vazia");
		}else {
			No aux = cabeca_lista;
			cabeca_lista = novo_no.prox;
			
		}	  
	}
}
