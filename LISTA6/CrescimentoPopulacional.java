package lista6;

import java.util.Scanner;

public class CrescimentoPopulacional {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    
	    
	    double paisA,paisB;
	    int contAnos=0;
	    
	    paisA=80000;
	    paisB=200000;
	    
	    
	    while(paisA<paisB) {
	    	paisA=(paisA*0.03)+paisA;
	    	paisB=(paisB*0.015)+paisB;
	    	contAnos++;
	    }
	   
	    

	    System.out.printf("O pais A sera mais populoso que o pais B em %d anos\n",contAnos);


	    
	  num.close();
	} 
	 
}