package aula.buscabinaria;

// Aula 14 de Setembro 2018
//algoritmo não está funcionando

public class BuscaBinaria {
	

	public boolean encontrou_binario (int inicio, int fim, int chave_busca, int []v) {
		
		int meio = 0;
		meio = (inicio + meio)/2;
		if(inicio > fim) {
			return false;
		}else if (fim < inicio) {
			return true;
		}else if (chave_busca > v[meio]) {
			return encontrou_binario(meio + 1, fim, chave_busca, v);
		}else if (chave_busca < v[meio]) {
			return encontrou_binario(inicio, meio - 1, chave_busca,v);
		}
		return true;			
	}

}
