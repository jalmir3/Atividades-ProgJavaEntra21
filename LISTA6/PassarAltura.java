package lista6;

import java.util.Scanner;

public class PassarAltura {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    double chico=1.50,juca=1.10;
	    int cont=0;
	    
	    
	    while(chico>=juca) {
	    	chico=chico+0.02;
	    	juca=juca+0.03;
	    	cont++;
		    }
	  System.out.printf("Juca será maior que Chico em %d anos\n",cont);
	    
	  num.close();
	} 
	 
	}
