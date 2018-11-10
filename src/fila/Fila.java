package fila;

public class Fila {
	
	No final_fila;
	
	public void entrar(int n) {
		No novo_no = new No(n);
		novo_no.prox = final_fila;
		final_fila = novo_no;
		
	}
	
	public int sair() {
		No aux = final_fila;
		
		if(aux == null) {
			System.out.println("Fila Vazia");
			return -1;
		}else {
			while(aux.prox!=null) {
				aux = aux.prox;
			}
			if(aux ==final_fila) {
				final_fila = null;
			}else {
				No aux2;
				aux2 = final_fila;
				while(aux.prox!=aux) {
					aux2 = aux2.prox;
				}
				
				aux2.prox = null;
				
			}
			return aux.conteudo;
		}
		
	}
	
	
	public void listar() {
		No aux = final_fila;
		String fila = "";
		while(aux!=null) {
			fila = fila + "-" +aux.conteudo;
		}
		System.out.println(fila);
	}

}
