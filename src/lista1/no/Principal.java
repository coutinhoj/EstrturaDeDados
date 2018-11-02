package lista1.no;

public class Principal {
	
static No cabecaLista;
	
	public static void insereNoLista(int n){
		No novoNo = new No();
		novoNo.conteudo = n;
		
		if(cabecaLista == null){
			cabecaLista = novoNo;
			cabecaLista.proximo = null;
		}else {
			novoNo.proximo = cabecaLista;
			cabecaLista = novoNo;
		}
	}
	
	public static void listaLista(){
		if (cabecaLista == null){
			System.out.println("Lista Vazia");
		}else{
			No aux = cabecaLista;
			while(aux != null){
				System.out.println(aux.conteudo);
				aux = aux.proximo;
			}
		}
	}
	
	
	public No conteudo (){
		return this.conteudo();
			
		}
	
	
	public static void main (String [] args){
		insereNoLista(15);
		insereNoLista(9);
		insereNoLista(5);
		insereNoLista(3);
		
		listaLista();
	}

}
