package lista6;

import java.util.Scanner;

public class SomaDobro {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int soma=0,aux=1;
		
	     for(int i=0;i<64;i++) {
	    	 
	    	 
	    	 aux=aux*2;
	    	 soma+=aux;
	    	 System.out.printf("%d\n",aux); 
	    	 
	     }
	     System.out.printf("soma=%d\n",soma);
	  num.close();
	} 
	 
}