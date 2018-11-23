package lista.recAv1.listacircularencadeada;

public class Lista {
	
	No inicio;
	No fim;
	No aux;
	
	public void lista(){
		inicio = null;
		fim =null;
	}
	
	//metodo inserir ok
	public void inserir (int conteudo) {
		No novo_no = new No(conteudo);
		
		if(inicio == null){
			inicio= novo_no;
			fim = novo_no;
			fim.proximo = novo_no;
		}else
			fim.proximo = novo_no;
		    novo_no.proximo = inicio;
		    fim = novo_no;
	}
	
	//metodo excluir ok
	public void excluirInicio() {
		inicio = inicio.proximo;
		fim.proximo =inicio;
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
