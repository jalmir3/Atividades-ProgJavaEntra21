package Lista7;

import java.util.Scanner;

public class ex3 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    int[] b = new int[a.length];
	    float[] c = new float[a.length];
	    
		int i;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    System.out.printf("Digite o vetor na posição %d:\n",i);
		    b[i] =num.nextInt();
		  }
	    for(i=0;i<a.length;i++) {
	    	c[i] = a[i] + b[i];
	    	 System.out.printf("\nSoma dos vetores= %.0f\n",c[i]);
	    }
	    for(i=0;i<a.length;i++) {
	    	c[i] = a[i]-b[i];
	    	System.out.printf("\nSubtracao dos vetores= %.0f\n",c[i]);
	    }
	    for(i=0;i<a.length;i++) {
	    	c[i] = a[i] * b[i];
	    	System.out.printf("\nMultiplicacao dos vetores= %.0f\n",c[i]);
	    }
	     for(i=0;i<a.length;i++) {
	    	 c[i] =(float)a[i] / b[i];
	    	 System.out.printf("\nDivisao dos vetores= %f\n",c[i]);
	       } 
	    
	     

    
	num.close();
	}

}
	 


