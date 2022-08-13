package Lista7;

import java.util.Scanner;

public class ex5 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    
	    
		int i,soma=0;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    
		  }
	    for(i=0;i<a.length;i++) {
	    	if(a[i]%5==0) {
		    	soma=soma+a[i];
		    	System.out.printf("\nMultiplo de 5= %d\n",a[i]);
		   }
	    	 
	    }
	    System.out.printf("\nSoma= %d\n",soma);
	    
	     

    
	num.close();
	}

}
	 



