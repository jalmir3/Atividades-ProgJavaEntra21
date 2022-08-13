package lista6;

import java.util.Scanner;

public class NumTriangular {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int valor,zerar=0;
	    
	    System.out.print("Digite um número positivo e inteiro:\n");
	    valor =num.nextInt();
	    
	    for(int i=0;i*(i+1)*(i+2)<=valor;i++) {
	    	if(i*(i+1)*(i+2)==valor) {
		    	System.out.printf("%d eh um numero triangular dos numeros %d x %d X %d\n",valor,i,i+1,i+2);
		    	zerar=1;
		    }
		  }
	    
	    if(zerar==0) {	
	    	System.out.printf("%d  não é  triangular\n",valor);
	    }
	    
	    
	    
		  
	      
	  num.close();
	  
	    } 
	 
	}