package Lista7;

import java.util.Scanner;

public class ex4 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    
	    
		int i,cont=0;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    
		  }
	    for(i=0;i<a.length;i++) {
	    	if(a[i]%2==0) {
		    	cont++;
		    	System.out.printf("\nPar= %d\n",a[i]);
		   }
	    	 
	    }
	    System.out.printf("\nQtd numeros pares= %d\n",cont);
	    
	     

    
	num.close();
	}

}
	 


