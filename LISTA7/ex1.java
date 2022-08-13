package Lista7;

import java.util.Scanner;

public class ex1 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[15];
	    int[] b = new int[a.length];
	    
	    
		int i;
	    
	   
	    
	    for(i=0;i<15;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    b[i] = a[i] * a[i];
		  
		   }
	     for(i=0;i<a.length;i++) {
	    	 System.out.printf("\nElemento %d posicao %d\n",a[i],i);
	       } 
	     for(i=0;i<a.length;i++) {
	    	 System.out.printf("\nElemento %d posicao %d\n",b[i],i);
	       } 
	   

    
	num.close();
	}

}
	 

