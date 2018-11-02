package lista1.fatorial;

import java.util.Scanner;

public class Fatorial {
	
public static int fat(int n){
		
		int vfat;
		
		
		if (n <= 1){
			
			 return 1;
		}else{
			
			vfat = n * fat(n - 1);
		     return (vfat);
		}				
	}
	
	public static void main(String [] args){
		
		Scanner f = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = f.nextInt();
		
		System.out.println("O fatorial de " +num+  " é: "+fat(num));
		
		f.close();
	}

}
