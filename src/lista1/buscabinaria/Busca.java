package lista1.buscabinaria;

public class Busca {
	
	static int buscaBinaria(int[] vetor, int valorProcurado, int inicio, int fim) {
		if (inicio>fim)
			return -1; // O valor procurado não existe no vetor
		int meio = (inicio+fim)/2; // Calculamos a posição central do vetor
		if (valorProcurado==vetor[meio]){
			return meio; // Se o valor procurado estiver na posição central do vetor, retornamos a posição
		}else{ // Se nao, se o valor procurado for maior que a posiçao central, buscamos na parte superior do vetor, caso contrario, buscamos na metade inferior
			if (valorProcurado>vetor[meio]){
				return buscaBinaria(vetor,valorProcurado,meio+1,fim);
			}else
				return buscaBinaria(vetor,valorProcurado,inicio,meio-1);
		}
	}
	
	public static void main(String[] args) {
		int[] vetor = {3,4,11,12,21,34,65,77,78,98};
		int vp = 4;

    System.out.println("Vetor na posição: "+buscaBinaria(vetor,vp,0,vetor.length-1));
     
	}

}
