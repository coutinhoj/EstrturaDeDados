package arvore.binaria;

public class Arvore {
	
	public No raiz;
	
	public Arvore() {
		
		raiz = null;
	}
	
	public void insere(No r, int n) {
		if(r == null) {
			r = new No(n);
		}else
			
			if(n<r.info) {
				insere(r.esq, n);
			}else {
				insere(r.dir, n);
			}
	}
	
	public void remover(No r, int n) {
		if(r == null) {
			System.out.println("Árvore vazia!");		
		}
		   if(n == r.info) {
			r = new No(n);
		  }
			if(n < r.info) {
				remover(r.esq, n);
			}else {
				remover(r.dir, n);
			}
	}
	
	//testar
		public void emOrdem(No no) {
			if(no !=null) {
				emOrdem(no.esq);
				System.out.println(no.info);
				emOrdem(no.dir);
			}
		}
		
		//testar
		public void preOrdem(No no) {
			if(no !=null) {
				System.out.println(no.info);
				preOrdem(no.esq);
				preOrdem(no.dir);
			}
		}
		
		//testar
		public void posOrdem(No no) {
			if(no != null) {
				posOrdem(no.esq);
				posOrdem(no.dir);
				System.out.println(no.info);
			}
		}
	
	public void busca (No r, int n) {
		if(r == null) {
			System.out.println("Arvore vazia");
		} 
			if(n == r.info) {
				r = new No(n);
			}
			
			if(n < r.info) {
				busca(r.esq,n);
			}else {
				busca(r.dir,n);
			}
	}
}
