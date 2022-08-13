package lista6;

import java.util.Scanner;

public class SomaProduto {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int valor,soma=0;
	    int mult=1;
	    
	    do {
	    System.out.print("Digite um número positivo e para terminar um negativo ou zero:\n");
	    valor =num.nextInt();
		  
	        if(valor%2==0) {
	        	
		    soma=soma+valor;
		    }
	        else {
	        mult=mult*valor;	
		    }
	    }while(valor>0);
	    System.out.printf("%d é a soma\n",soma);
	    System.out.printf("%d é o produto\n",mult);
	  num.close();
 }
}