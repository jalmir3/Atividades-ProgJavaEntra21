package Lista5;

import java.util.Scanner;

public class NeutroPosiNegativo {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int numero;
	    
	    System.out.print("digite um numero:\n");
	    numero=num.nextInt();
	  
	  
	    if(numero==0) {
	    	System.out.print("é neutro:\n");
	    }
	    else if(numero>0) {
	    	System.out.print("é positivo:\n");
	    }
	    else {
	    	System.out.print("é negativo:\n");
	    }

	  num.close();

	}

}