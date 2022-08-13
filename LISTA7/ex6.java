package Lista7;

import java.util.Scanner;

public class ex6 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    
	    
		int i,soma=0,cont=0,media=0;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    
		  }
	    for(i=0;i<a.length;i++) {
	    	if(a[i]%2==1) {
	    		cont++;
		    	soma=soma+a[i];
		    	System.out.printf("\nImpares= %d\n",a[i]);
		   }
	    	 
	    }
	    media=soma/cont;
	    System.out.printf("\nMedia= %d\n",media);
	    
	     

    
	num.close();
	}

}