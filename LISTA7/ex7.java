package Lista7;

import java.util.Scanner;

public class ex7 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    
	    
		int i,contI=0,contP=0,percP=0,percI=0;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    
		  }
	    for(i=0;i<a.length;i++) {
	    	if(a[i]%2==1) {
	    		contI++;
		    	System.out.printf("\nImpar= %d\n",a[i]);
		   }
	    	else {
	    		contP++;
	    		System.out.printf("\nPar= %d\n",a[i]);
	    	}
	    	 
	    }
	    percP=(contP*100)/10;
	    percI=(contI*100)/10;
	    System.out.printf("\nPercentual de par= %d %%\n",percP);
	    System.out.printf("\nPercentual de impar= %d %%\n",percI);
	    
	     

    
	num.close();
	}

}