package Lista7;

import java.util.Scanner;

public class ex2 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    int[] b = new int[a.length];
	    int[] c = new int[a.length];
	    
		int i;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    b[i] = a[i] * i;
		    c[i] = a[i] % 2;
		   }
	     for(i=0;i<a.length;i++) {
	    	 System.out.printf("\nElemento %d posicao %d\n",a[i],i);
	       } 
	     for(i=0;i<a.length;i++) {
	    	 System.out.printf("\nElemento %d posicao %d\n",b[i],i);
	       } 
	     for(i=0;i<a.length;i++) {
	    	 System.out.printf("\nElemento %d posicao %d\n",c[i],i);
	       } 

    
	num.close();
	}

}
	 


