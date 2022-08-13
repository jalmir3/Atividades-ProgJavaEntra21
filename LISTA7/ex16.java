package Lista7;

import java.util.Scanner;

public class ex16 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] A = new int[10];
	    
	    
		int i;
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o numero do vetor A da posicao %d:\n",i+1);
		    A[i] =num.nextInt();
		    
		}
	    System.out.printf(" Vetor sem nulos ou negativos ");
	    for(i=0;i<10;i++) {
	    	if(A[i]>0) {
	    		System.out.printf(" %d ",A[i]);
	    	}
	    		
	        
	    }
	   
	    
	    num.close();
	}

}


