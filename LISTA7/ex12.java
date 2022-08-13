package Lista7;

import java.util.Scanner;

public class ex12 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] numero = new int[10];
	    
	    
		int i;
	 
	   
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o numero da posicao %d:\n",i+1);
		    numero[i] =num.nextInt();
		}
	    for(i=0;i<10;i++) {
	    	if(numero[i]%2==0) {
	    		System.out.printf("\nnumero= %d par posicao %d\n",numero[i],i+1);
	    	}
	    	
	    	else {
	    	    
	    		System.out.printf("\nnumero= %d impar posicao %d programa encerrado\n",numero[i],i+1);
	    		break;
	    	  
	    	}
	    }
	    
	 
	    
	     

    
	num.close();
	}

}


