package Lista7;

import java.util.Scanner;

public class ex13 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] numero = new int[10];
	    int[] invertido = new int[10];
	    
		int i;
	 
	   
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o numero da posicao %d:\n",i+1);
		    numero[i] =num.nextInt();
		}
	    System.out.print("\nVetor B=");
	    for(i=0;i<10;i++) {
	            invertido[i]=numero[10-i-1];
	    		System.out.printf("\n %d \n",invertido[i]);
	  
	    	}
	    
	    
	 
	    
	     

    
	num.close();
	}

}


