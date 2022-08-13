package lista2;

import java.util.Scanner;

public class Impressao {

	public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
	    
	    int folhas;
	    double valor;
	    
	    
	    System.out.print("digite quantidade de folhas:\n");
	    folhas=num.nextInt();
	    
	    
	    valor= (folhas+folhas)*0.08;
	    
	    
	    System.out.printf("%.1f reais é o valor a ser pago \n",valor);
	    
	    

	  num.close();
	}

}
