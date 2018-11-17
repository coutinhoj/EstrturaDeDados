package lista.recAv1.listacircularencadeada;

public class Lista {
	
	No inicio;
	No fim;
	No aux;
	
	public void lista(){
		inicio = null;
		fim =null;
	}
	
	//falta
	public void inserir (int conteudo) {
		
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
	
	

}
