package Lista5;

import java.util.Scanner;

public class CaixaFrutas {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
	    char fruta;
	    double valor,total;
	    
	    System.out.print("Qual o tipo de fruta deseja[1=morango/2=limao ou 3=laranja]:\n");
	    fruta =num.next().charAt(0);
	    System.out.print("Valor unitario da fruta escolhida:\n");
	    valor =num.nextDouble();
	    
	    switch(fruta) {
	    case '1':
	    	total=valor*20;
	    	System.out.printf("Valor a pagar= %.2f reais na caixa de morangos\n ",total);
	    	break;
	    case '2':
	    	total=valor*80;
	    	System.out.printf("Valor a pagar= %.2f reais na caixa de limão\n  ",total);
	    	break;
	    case '3':
	    	total=valor*60;
	    	System.out.printf("Valor a pagar= %.2f reais ma caixa de laranja\n ",total);
	    	break;
	    }
	    
	    
	   
	    
	    
	  num.close();

	}

}
