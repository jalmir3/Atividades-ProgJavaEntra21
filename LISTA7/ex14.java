package Lista7;

import java.util.Scanner;

public class ex14 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] A = new int[10];
	    int[] B = new int[10];
	    int[] C = new int[20];
		int i;
	 
	   
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o numero do vetor A da posicao %d:\n",i+1);
		    A[i] =num.nextInt();
		    System.out.printf("Digite o numero do vetor B da posicao %d:\n",i+1);
		    B[i] =num.nextInt();
		}
	    System.out.print("\nVetor C=");
	    for(i=0;i<10;i++) {
	    		
	    		C[i]=A[i];
	        }
	    for(i=0;i<10;i++) {
    		
    		C[i+10]=B[i];
        }
	    for(i=0;i<20;i++) {
    		System.out.printf(" %d ",C[i]);
    
        }	
       
	    
	    num.close();
	}

}


