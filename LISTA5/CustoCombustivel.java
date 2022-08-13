package Lista5;

import java.util.Scanner;

public class CustoCombustivel {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    double litros,valor;
	    char combustivel;
	    
	    
	    System.out.print("Qual o tipo de combustivel[G=gasolina/A=Alcool/D=diesel:\n");
	    combustivel =num.next().charAt(0);
	    System.out.print("Quantidade de litros:\n");
	    litros =num.nextDouble();
	    
	    switch(combustivel) {
	    case 'G':
	    	valor=litros*2.53;
	    	System.out.printf("Valor a pagar= %.2f reais\n ",valor);
	    	break;
	    case 'A':
	    	valor=litros*2.09;
	    	System.out.printf("Valor a pagar= %.2f reais\n ",valor);
	    	break;
	    case 'D':
	    	valor=litros*1.92;
	    	System.out.printf("Valor a pagar= %.2f reais\n ",valor);
	    	break;
	    }
	    
	    
	    if(litros>30 && combustivel=='A') {
	    	System.out.print("Voce ganhou de cortesia uma troca de oleo\n");
	    }
	    else  {
	    	System.out.printf("\n");
	    }
	    
	    
	  num.close();

	}

}
