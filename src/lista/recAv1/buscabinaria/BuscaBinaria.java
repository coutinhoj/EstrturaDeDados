package lista.recAv1.buscabinaria;

public class BuscaBinaria {
	
	static int buscaBinaria(int[] vetor, int valorProcurado, int inicio, int fim) {
		if (inicio>fim)
			return -1; 
		int meio = (inicio+fim)/2; 
		if (valorProcurado==vetor[meio]){
			return meio; 
		}else{ 
			if (valorProcurado>vetor[meio]){
				return buscaBinaria(vetor,valorProcurado,meio+1,fim);
			}else
				return buscaBinaria(vetor,valorProcurado,inicio,meio-1);
		}
	}
	
	public static void main(String[] args) {
		int[] vetor = {8,9,12,18,21,24,42,44,76,93};
		int vp = 12;

        System.out.println("Vetor na posição: "+buscaBinaria(vetor,vp,0,vetor.length-1));
     
	}


}
