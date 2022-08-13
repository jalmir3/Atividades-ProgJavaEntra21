package Lista7;

import java.util.Scanner;

public class ex9 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] idade = new int[10];
	    
	    
		int i,cont=0;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite a idade %d:\n",i);
		    idade[i] =num.nextInt();
		    if(idade[i]>35) {
		    	cont++;
		    }
		  }
	    
	    System.out.printf("\nQuantidade de pessoas com mais de 35 anos= %d pessoas \n",cont);
	 
	    
	     

    
	num.close();
	}

}
