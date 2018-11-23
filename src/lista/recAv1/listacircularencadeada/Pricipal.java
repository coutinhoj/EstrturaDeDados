package lista.recAv1.listacircularencadeada;

public class Pricipal {

	public static void main(String[] args) {
		Lista l = new Lista();
		 
		l.inserir(56);
		l.inserir(34);
		l.inserir(45);
		l.excluirInicio();
		
		String Lista_Circular = l.listar();
	}

}


