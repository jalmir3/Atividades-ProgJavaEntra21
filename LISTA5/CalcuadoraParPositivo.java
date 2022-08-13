package Lista5;

import java.util.Scanner;

public class CalculadoraParPositivo {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		int num1,num2,soma=0;
		double div=0;
		char op;
	    
		System.out.print("Digite um numero inteiro o operador[+ - / *] e digite outro numero inteiro\n ");
		
	    num1 =num.nextInt();
	    op =num.next().charAt(0);
	    num2 =num.nextInt();
	    
	    if(op!='+' && op!='-' && op!='/' && op!='*' ) {
	    	System.out.print("Operador inválido");
	    }
	    else {
	    switch(op) {
	    case '+':
	    	soma=num1+num2;
	    	System.out.printf("Resultado= %d\n ",soma);
	    	break;
	    case '-':
	    	soma=num1-num2;
	    	System.out.printf("Resultado= %d\n ",soma);
	    	break;
	    case '*':
	    	soma=num1*num2;
	    	System.out.printf("Resultado= %d\n ",soma);
	    	break;
	    case '/':
	    	div=(double)num1/num2;
	    	System.out.printf("Resultado= %f\n ",div);
	    	break;
	    }
	    
	    
	    if(soma>0 || div>0) {
	    	 System.out.print("Eh positivo\n"); 
	    }
	    else if(soma<0 || div<0) {
	    	 System.out.print("Eh negativo\n");
	    }
	    
	    soma=soma%2;
	    
	    switch(soma) {
	     case 0:
	    	 System.out.print("Eh par\n");
	    	 break;
	     case 1:
	    	 System.out.print("Eh impar\n");
	    	 break;
	     }
	    
	    
	    }
	    
	    num.close();

	}

}
