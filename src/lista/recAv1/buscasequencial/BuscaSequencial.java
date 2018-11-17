package lista.recAv1.buscasequencial;

import java.util.Scanner;

public class BuscaSequencial {
	
   public  static void main (String [] args){
		
		Scanner b = new Scanner (System.in);
		
		int [] vet = {8,24,76,9,42,18,44,21,12,93};
		
		System.out.println("Digite um número para busca: ");
		int num = b.nextInt();
		
		for(int j=0; j<vet.length; j++){
			
			if(num == vet[j]){
				System.out.println("");
				System.out.println("Vetor encontrado na posição : "+j);
				break;
			}else{
				
				System.out.println("");
				System.out.println("Vetor na posição "+j+" : "+vet[j]);
			}

		}
		
		
		b.close();
	} 

}
