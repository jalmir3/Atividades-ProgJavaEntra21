package lista6;

import java.util.Scanner;

public class MaiorValorDigitado {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    int valor, maior=-1000;
	    
	    do {
	    System.out.print("Digite um numero inteiro/Para sair digite -1:\n");
	    valor =num.nextInt();
	    if(valor>maior)	{
	    	maior=valor;
	    }
	   	
	    }while(valor!=-1);
	     
	     System.out.printf("maior valor digitado %d\n",maior);
	    
	  num.close();
	} 
	 
}