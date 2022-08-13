package lista6;

import java.util.Scanner;

public class NumeroPrimo {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    int valor,cont=0;
	    
	    System.out.print("Digite um numero:\n");
	    valor =num.nextInt();
	   
	 
	    for (int i = 2; i <= valor / 2; i++) {
	        if (valor % i == 0) {
	           cont++;
	        }
	     }
	     
	     if (cont == 0)
	    	 System.out.printf("%d é um número primo\n", valor);
	     else
	    	 System.out.printf("%d não é um número primo\n", valor);
	     
	    
	  num.close();
	} 
	 
}