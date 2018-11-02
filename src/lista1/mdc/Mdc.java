package lista1.mdc;

import java.util.Scanner;

public class Mdc {
	
	public static int mdc (int dividendo, int divisor){
		
		  
		if(dividendo % divisor == 0){
			return divisor;
		}else{
			return mdc (divisor, (dividendo % divisor));
		}
	}

	public static void main(String [] args){
		Scanner m = new Scanner(System.in);
		
		System.out.println("Digite o 1° número: ");
		int num1 = m.nextInt();
		System.out.println("Digite o 2° número: ");
		int num2 =m.nextInt();
		
		System.out.println("O Mdc de "+num1+" , "+num2+ " : "+mdc(num1,num2)+"\n");
		
		m.close();
	}   

}
