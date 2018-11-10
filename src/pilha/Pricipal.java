package pilha;

public class Pricipal {

	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		
		p.inserir(10);
		p.inserir(18);
		p.inserir(34);
		p.inserir(12);
		p.retirar();
		p.retirar();
		p.listar();
	}

}
