package lista6;

import java.util.Scanner;

public class ContarDigitadosEntre {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    int valor,cont=0;
	    
	    do {
	    	System.out.print("Digite um número ou zero para encerrar:\n");
		    valor =num.nextInt();
	        if(valor>=100 && valor<=200) {
		    	cont++;
		    }
	    }while(valor>0);
	    System.out.printf("Numeros entre 100 e 200 foram digitados %d vezes\n",cont);
	    
	  num.close();
	} 
	 
	}