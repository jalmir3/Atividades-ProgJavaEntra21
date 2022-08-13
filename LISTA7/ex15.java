package Lista7;

import java.util.Scanner;

public class ex15 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] A = new int[3];
	   
	    
		int i,j;
	 
	   
	   for(i=0;i<3;i++) {
	    	System.out.printf("\nDigite o numero do vetor A da posicao %d:\n",i+1);
		    A[i] =num.nextInt();
		    for(j=1;j<A[i]+1;j++) {
	    	    if(A[i]%j==0) {
	    		System.out.printf("\n %d ",j);
	        }
	    }
		    
		}
	   
	   
	    
	    num.close();
	}

}


