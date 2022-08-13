package lista6;

import java.util.Scanner;

public class EntreNumeros {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    
	    
	    int n1,n2;
	   
	    
	    System.out.print("Digite o primeiro numero:\n");
	    n1 =num.nextInt();
	    System.out.print("Digite o segundo numero:\n");
	    n2 =num.nextInt();
	    
	    for(int i=n1+1;i<n2;i++) {
	    	System.out.printf("%d\n",i);	
	    	
	    }
	   
	    

	   


	    
	  num.close();
	} 
	 
}

