package listaduplamenteencadeada;

public class Nod {
	
	int info;
	Nod ant;
	Nod prox;
	
	//construtor
	public Nod (int n) {
		
		info = n;
		prox = null;
		ant = null;
	}

}
