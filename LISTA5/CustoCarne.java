package Lista5;

import java.util.Scanner;

public class CustoCarne {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		char tipo;
		float kg;
	    double valor,desc;
	   
		System.out.print("Escolha o tipo de carne[F=filé duplo/A=alcatra/P=picanha]:");
		tipo =num.next().charAt(0);
		System.out.print("\nQuantidade de kgs:\n");
		kg =num.nextInt();
		
		switch(tipo) {
		case 'F':
			System.out.printf("Tipo de carne escolhido é filé duplo e o peso é %.1f kg\n",kg);
			break;
		case 'A':
			System.out.printf("Tipo de carne escolhido é alcatra e o peso é %.1f kg\n",kg);
			break;
		case 'P':
			System.out.printf("Tipo de carne escolhido é picanha e o peso é %.1f kg\n",kg);
			break;
		    }
		 
		
	    
	    if(kg<5 && tipo=='F') {
	        valor=kg*4.9;
	    	System.out.printf("%.1f kg de filé custam %.1f reais\n",kg,valor);
	    }
	    else if(kg>5 && tipo=='F') {
	        valor=kg*5.8;
	    	System.out.printf("%.1f kg de filé custam %.1f reais\n",kg,valor);
	    }
	    else if(kg<5 && tipo=='A') {
	        valor=kg*5.9;
	    	System.out.printf("%.1f kg de alcatra custam %.1f reais\n",kg,valor);
	    }
	    else if(kg>5 && tipo=='A') {
	        valor=kg*6.8;
	    	System.out.printf("%.1f kg de alcatra custam %.1f reais\n",kg,valor);
	    }
	    else if(kg<5 && tipo=='P') {
	        valor=kg*6.9;
	    	System.out.printf("%.1f kg de picanha custam %.1f reais\n",kg,valor);
	    }
	    else {
	        valor=kg*7.8;
	    	System.out.printf("%.1f kg de picanha custam %.1f reais\n",kg,valor);
	    }
	    System.out.print("Para pagar com cartão digite 1:\n");
		int pagar =num.nextInt();
		
		if(pagar==1) {
			desc=(valor*0.05);
			valor=valor-desc;
			System.out.printf("Voce recebeu %.1f reais desconto,valor a pagar %.1f",desc,valor);
		}
	  num.close();

	}

}