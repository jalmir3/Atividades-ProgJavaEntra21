package Lista7;

import java.util.Scanner;

public class ex11 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    
	    int i,invert=0,aux=0;
	   
	   
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o valor da posicao %d:\n",i+1);
		    a[i] =num.nextInt();
		    
		    }
	    for(i=0;i<10;i++) {
	    	aux=a[i];
	    	while(aux>0) {
	    		invert=invert*10 + aux %10;
	    	}
	    	if(a[i]== invert) {
	    		System.out.print("\nEh palindromo \n");
	    }
	    	else {
	    		System.out.printf("\nNao eh palindromo \n");
    		
	    	}
	    }
    
	    
	    num.close();
	}

}
