package lista2.arvorebinaria;

public class Arvore {
	
	public No raiz;
	
	public Arvore() {
		
		raiz = null;
	}
	
	public void insere (No r, int n) {
		if(r == null) {
			r= new No(n);
		}else {
			if(n < r.info) {
				insere(r.esq, n);
			}else {
				insere(r.dir, n);
			}
		}
	}

}
