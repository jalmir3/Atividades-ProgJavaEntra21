package Lista7;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		int[] X = new int[10];
		
		int i,cont=0,num1=100;
	    
		while(cont<10) {
			int contAux=0;
			num1++;
	    	for(i=1;i<num1;i++) {
	    		if(num1%i==0) {
	    			contAux++;
	    }
		}
		
	    	if(contAux>2) {
	    		continue;
	    }
	    X[cont]=num1;
		  cont++;  	
		  System.out.printf(" %d ", num1);
	     }
	
num.close();
}

}
