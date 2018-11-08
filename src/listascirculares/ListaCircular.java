package listascirculares;


public class ListaCircular {
	
	No inicio;
	No fim;
	No aux;
	
	
	
	public void listaCircular(){
		inicio = null;
		fim =null;
	}
	
	public void inserir_inicio(int conteudo){
		
		No novo_no = new No(conteudo);
		
		if(inicio == null){
			inicio = novo_no;
			fim = novo_no;
			novo_no.proximo = inicio;
			novo_no.anterior = inicio;
			
		}else{
			novo_no.proximo = inicio;
			inicio.anterior =novo_no;
			novo_no.anterior = fim;
			fim.proximo = novo_no;
			inicio = novo_no;
		}
	}
	
		public void inserir_fim(int conteudo){
			No novo_no = new No(conteudo);
			
			if(inicio == null){
				inicio = novo_no;
				fim = novo_no;
				novo_no.proximo = inicio;
				novo_no.anterior = inicio;
				
			}else{
				fim.proximo = novo_no;
				novo_no.anterior = fim;
				 fim = novo_no;
				fim.proximo = inicio;
				inicio.anterior = fim;
			}			
		}
		
		public String listar(){
			
			if (inicio ==null) {
				System.out.println("Lista Vazia");
			}else {
				aux = inicio;
				
				do {
					System.out.println(aux.conteudo + " ");
					aux = aux.proximo;
				} while (aux !=inicio);
				System.out.println("\n");
			}		
			return null;
		}
	
		public boolean localizar(int n){
			
			No aux = inicio;
			
			boolean encontrado = false;
				
			do {
				if (n == aux.conteudo) {
					encontrado = true;
					System.out.println("Encontrou!");
				}
				else {
					 aux = aux.proximo;
					
				}
			}while (aux != inicio && encontrado != true);
			
			return encontrado;
		}
		
		
		
		public void remover(int n){
			
			if(inicio == null){
				System.out.println("Lista vazia.");
			}else{
				aux = inicio;
				int encontrou = 0;
				int tamanho = 0;
				
				do{
					tamanho++;
					aux = aux.proximo;
				}while(aux != inicio);
				
				int elemento = 1;
				do{
					if(inicio == fim && inicio.conteudo == n){
						inicio =null;
						encontrou++;
					}else{
						if(aux.conteudo == n){
							encontrou++;
							if(aux ==inicio){
								inicio = aux.proximo;
								inicio.anterior = fim;
								fim.proximo =inicio;
								aux =inicio;
	
							}else if(aux == fim){
								fim = fim.anterior;
								fim.proximo =inicio;
								inicio.anterior = fim;
								aux =null;
							}else{
								aux.anterior.proximo = aux.proximo;
								aux.proximo.anterior = aux.anterior;
								aux = aux.proximo;					
							}
							
							}else{
								aux =aux.proximo;
							}
						}
					elemento ++;
					}while(elemento <= tamanho);
					if(encontrou == 0){
						System.out.println("numero não encontrado");
					   }else if(encontrou == 1){
						   System.out.println("numero removido 1 vez");
					   }else{
						   System.out.println("numero removido" + encontrou + "vezes");
					   }
					}
					
				}
			
			public void remover_fim() {
				No aux2;
				
				aux =fim;
				aux2 =fim;
				
				if(aux.proximo == null) {
					
				}else if(aux.proximo == null) {
					fim = null;
				}else {
					while(aux.proximo != null) {
						aux = aux .proximo;
					}
					while(aux2.proximo != aux) {
						aux2 = aux2.proximo;
					}
					aux2.proximo = null;
				}
				
				
			}

	
	

}
