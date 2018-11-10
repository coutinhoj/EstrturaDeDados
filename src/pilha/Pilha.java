package pilha;

public class Pilha {
	
	No topo;
	
	public void inserir(int n) {
		
		No novo_no = new No(n);
		
		novo_no.prox = topo;
		topo = novo_no;		
	}
	
	public int retirar() {
		if(topo == null) {
			return -1;
		}else {
			No aux = topo;
			topo = topo.prox;
			return aux.conteudo;
		}
	}
	
	public void listar() {
		No aux = topo;
		
		while(aux!= null) {
			System.out.println(aux.conteudo);
			aux = aux.prox;
		}
	}

}
