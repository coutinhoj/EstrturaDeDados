package lista1.buscasequencial;

import java.util.Scanner;

public class Busca {
	
public  static void main (String [] args){
		
		Scanner b = new Scanner (System.in);
		
		int [] vet = {4,78,12,3,65,21,34,77,98,11};
		
		System.out.println("Digite um número para busca: ");
		int num = b.nextInt();
		
		for(int j=0; j<vet.length; j++){
			
			if(num == vet[j]){
				System.out.println("");
				System.out.println("Vetor encontrado na posição "+j+" : "+j);
				break;
			}else{
				
				System.out.println("");
				System.out.println("Vetor na posição "+j+" : "+vet[j]);
			}
		}
		
		
		b.close();
	} 
	

}
